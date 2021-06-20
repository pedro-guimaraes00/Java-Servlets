<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/UpdateCompany" var="linkServletNewCompany" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf8">
		<title>Form New Company</title>
	</head>
	<body>
	
	<form method="POST" action="${linkServletNewCompany}">
		Nome: <input type="text" name="name" value="${company.name}"/>
		<input type="text" name="id" value="${company.id}"/>
		<input type="submit" value="Enviar" />
	</form>
	
	</body>
</html>