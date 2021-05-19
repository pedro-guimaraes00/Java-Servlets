package br.com.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewCompany
 */
@WebServlet("/NewCompany")
public class NewCompany extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Register new company");
		
		String nameParameter = request.getParameter("name");
		Company company = new Company();
		company.setName(nameParameter); 
		
		
		Database database = new Database();
		database.create(company);
		
		RequestDispatcher rd = request.getRequestDispatcher("/NewCompanyCreated.jsp");
		request.setAttribute("company", company.getName());
		rd.forward(request, response);
	}

}
