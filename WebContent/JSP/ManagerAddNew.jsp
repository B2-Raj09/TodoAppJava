<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Time"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.Date"%>
<%@page import="java.lang.Integer"%>
<%@page import="model.task"%>
<%@page import="doa.DataAccess"%>
<%@page import="java.text.SimpleDateFormat"%>

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
String task_name = request.getParameter("task_name");
String is_done = request.getParameter("is_done");
Date dateTemp = new Date(System.currentTimeMillis());
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
task t;
String createdAt = dateFormat.format(dateTemp.getTime());

/* if(is_done == "1"){
String doneAt = dateFormat.format(dateTemp.getTime());
	t = new task(0, task_name, is_done, createdAt, doneAt);
}else {*/
	t = new task(0, task_name, is_done, createdAt, null); 

DataAccess da = new DataAccess();
da.addNew(t);

response.sendRedirect("/TodoApp/AllTask");
%>
createdAt
</body>
</html>