<%
String nameParameter = (String)request.getAttribute("company");
System.out.println(nameParameter);
%>

<html>
<body>
	<h4>Empresa <% out.println(nameParameter); %> cadastrada com sucesso.</h4>
</body>
</html>