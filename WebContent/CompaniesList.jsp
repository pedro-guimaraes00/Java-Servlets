<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page import="java.util.List,br.com.gerenciador.servlet.Company" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista de Empresas</title>
	</head>
	<body>
		<ul>
			<c:forEach items="${companies}" var="company">
				<li>${company.name}</li>
				<a href="/gerenciador/showCompany?id=${company.id}">editar</a>
				<a href="/gerenciador/deleteCompany?id=${company.id}">remover</a>
			</c:forEach>
		</ul>
	</body>
</html>