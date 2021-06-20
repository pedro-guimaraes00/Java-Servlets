package br.com.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateCompany
 */
@WebServlet("/UpdateCompany")
public class UpdateCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Register new company");
		
		Database database = new Database();
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		String nameParameter = request.getParameter("name");
		Company company = database.searchCompany(id);
		company.setName(nameParameter); 
		
		response.sendRedirect("listCompanies");
	}

}
