<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task List</title>
</head>
<body>
	<h3>List of Tasks</h3>
	<table border="1">
		<th>Task ID</th>
		<th>Task Name</th>
		<th>Is Completed</th>
		<th>Created At</th>
		<th>Completed At</th>
		<c:forEach items="${AllTasks}" var="task">
			<tr>
				<td>${task.task_id}</td>
				<td>${task.task_name}</td>
				<td>${task.is_done }</td>
				<td>${task.createdAt }</td>
				<td>${task.doneAt }</td>
				<td>
					<a href="edit?id=${task.task_id }">Edit</a>
					<a href="delete?id=${task.task_id }">Delete</a>
				</td>
			</tr>
		</c:forEach>

	</table>
	<br />
</body>
</html>