<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id="qwer";
	String pw="qwer";
	String name="성윤정";
	request.setCharacterEncoding("UTF-8");
	//성공
	if(id.equals(request.getParameter("id")) && pw.equals(request.getParameter("pw"))) {
		response.sendRedirect("10_main.jsp?name="+URLEncoder.encode(name, "UTF-8"));
		
	}else {
		response.sendRedirect("10_LoginForm.jsp");
	}
%>