<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<title>Secret Code</title>
	</head>
	<body>
		<div class='container'>
			<div>
				<p><c:out value="${error}" /></p>
				<h3>What is the code?</h3>
				<form method="POST" action="codeCheck">
				    <p><input type="text" name="code"></p>
				    <button>Try Code</button>
				</form>
			</div>
		</div>
	</body>
</html>