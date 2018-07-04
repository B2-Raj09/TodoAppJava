<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>

<h1>Edit Task</h1>
<c:forEach items="${getTasksById}" var="task">
<form action="./JSP/ManagerEditTask.jsp" method="post">
			<input type="hidden" name="task_id" value="${task.task_id}"/>
			<table>
				<tr>
					<td>Task Name</td>
					<td><input type="text" value="${task.task_name}" name="task_name"  /></td>
				</tr>
				<tr>
					<td>Completed: No-0 or Yes-1</td>
					<td><input type="text" value="${task.is_done}" name="is_done" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="add" value="Add" /></td>
				</tr>
			</table>
		</form>
</c:forEach>
</body>
</html>