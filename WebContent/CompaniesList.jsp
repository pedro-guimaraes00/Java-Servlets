<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@page import="java.util.List,br.com.gerenciador.servlet.Company" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista de Empresas</title>
	</head>
	<body>
		<ul>
			<%
				List<Company> lista = (List<Company>)request.getAttribute("empresas");
				for (Company company: lista) {
			%>		
					<li><%= company.getName() %></li>
			<%
				}
			%>			
		</ul>
	</body>
</html>