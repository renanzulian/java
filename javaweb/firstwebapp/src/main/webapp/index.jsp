<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!-- <html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
	<h1>Hello World!</h1>
	<c:if test="${not empty param.name}">
		<p>Name: ${param.name}</p>
	</c:if>
</body>
</html> -->
<html>
	<body>
		<%-- comentário em JSP aqui: nossa primeira página JSP --%>
		<%
			String mensagem = "Bem vindo ao sistema de agenda do FJ-21!";
		%>
		<% out.println(mensagem); %>
	<br/>
	<%
		String desenvolvido = "Desenvolvido por Renoite";
	%>
	<%= desenvolvido %>
	<br/>
	<%
		System.out.println("Tudo foi executado!");
	%>
	</body>
</html>