<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>

<h1>Edit Task</h1>
<c:forEach var="task" items="${getTaskById}">
<form action="./JSP/ManagerEditTask.jsp" method="post">
			<table>
				<tr>
					<td><input type="hidden" value="${task.task_id}" name="task_id" /></td>
				</tr>
				<tr>
					<td>Task Name</td>
					<td><input type="text" value="${task.task_name}" name="task_name" /></td>
				</tr>
				<tr>
					<td>Completed: No-0 or Yes-1</td>
					<td><input type="text" value="${task.is_done}" name="is_done" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form>
</c:forEach>
</body>
</html>