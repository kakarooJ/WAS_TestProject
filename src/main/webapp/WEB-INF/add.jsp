<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Add</title>
</head>
<body>
<h1> Add Function</h1>
��� : ${ result } <br>
<%
	int a = Integer.parseInt(request.getParameter("a"));
	int b = Integer.parseInt(request.getParameter("b"));
%>
<%= a %> + <%= b %> = <%= a+b %>
</body>
</html>