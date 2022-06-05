<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int valor1 = 10;
		int valor2 = 15;
		int resultado = valor1 + valor2;
		out.println("O resultado é " + resultado);
	%>
	<br/> <!-- pular linha -->
	<%= "O resultado é " + resultado %>
</body>
</html>