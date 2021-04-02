package br.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class listCompanies
 */
@WebServlet("/listCompanies")
public class listCompanies extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Database database = new Database();
		List<Company> lista = database.getCompanies();
		
		//Retornar interações HTML no navegador
		PrintWriter out = response.getWriter();
		
			out.println("<html>");
			out.println("<body>");
			out.println("<ul>");
				
				for (Company company: lista) {
					out.println("<li>" + company.getName() + "</li>");
				}
			
			out.println("</ul>");
			out.println("</body>");
			out.println("</html>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
