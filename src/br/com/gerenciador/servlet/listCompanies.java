package br.com.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
		
			request.setAttribute("empresas", lista);
			RequestDispatcher rd = request.getRequestDispatcher("/CompaniesList.jsp");
			rd.forward(request, response);
	}

}
