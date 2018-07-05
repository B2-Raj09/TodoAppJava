<%@page import="doa.DataAccess"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>
<body>
<%
	String idTemp = request.getParameter("task_id");
	int task_id = Integer.parseInt(idTemp);
	
	String taskname = request.getParameter("task_name");
	String is_done = request.getParameter("is_done");
	Date dateTemp = new Date(System.currentTimeMillis());
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	String doneAt = dateFormat.format(dateTemp.getTime());
	DataAccess da = new DataAccess();
	da.edit(task_id, taskname, is_done, doneAt);
	
	response.sendRedirect("/TodoApp/AllTask");
%>
</body>
</html>