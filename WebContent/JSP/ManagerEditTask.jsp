<%@page import="doa.DataAccess"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>
<body>
<%
	String idTemp = request.getParameter("task_id");
	int id = Integer.parseInt(idTemp);
	
	String taskname = request.getParameter("task_name");
	String comp = request.getParameter("is_done");
	
	DataAccess da = new DataAccess();
	da.edit(id, taskname, comp);
	
	response.sendRedirect("/TodoApp/AllTask");
%>
</body>
</html>