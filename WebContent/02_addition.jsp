<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--여기 적으면 필드, body안에 적으면 지역 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP - addition</title>
</head>
<body>
<%
	int num1 = 20;
	int num2 = 30; 
	int add = num1+num2;
	out.print(num1 + "+" + num2 + "=" + add);
%>
<br>
<%=add %>
</body>
</html>