<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<h1>Spring One</h1>
		<hr />
		<h2>${result}</h2>
		
		<jsp:include page="/addPage" />
		<jsp:include page="/viewPage" />		
		
	</body>
</html>
