<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="style.css">
<html>
<head>
<meta charset="UTF-8">
<title>Add Task</title>
</head>
<body>
<header>
	<h1>
		Todo App
	</h1>
	<nav>
		<ul>
			<li> <a href="index.jsp">Accueil</a> </li>
			<li> <a href="AddTask">Add Task</a> </li>
			<li> <a href="ListTask">Liste</a> </li>
		</ul>
	</nav>
</header>
	<h1>Add Task</h1>
	<%=request.getAttribute("message")==null?"":request.getAttribute("message") %>
	<form method="post" action="${pageContext.request.contextPath}/AddTask">
		<label for="content">Content:</label>
		<input type="text" id="content" name="content" required>
		<br>
		<input type="submit" value="Add">
	</form>
<footer>
	copyright estf @2023
</footer>
</body>
</html>

