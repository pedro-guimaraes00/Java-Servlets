<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
	<c:if test="${not empty company}">
		<h4>Empresa ${company} cadastrada com sucesso.</h4>
	</c:if>
	
	<c:if test="${empty company}">
		<h4>Falha ao cadastrar empresa.</h4>
	</c:if>
	
</body>
</html>