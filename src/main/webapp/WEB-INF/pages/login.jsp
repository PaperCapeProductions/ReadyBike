<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>

<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/bootstrap.js" />"></script>
<script src="<c:url value="/resources/js/jquery-2.2.2.js" />"></script>
<script src="<c:url value="/resources/js/npm.js" />"></script>

</head>
<body>
	<div class="container">
		<h2 class="text-center">Login</h2>
		<!--Search Form -->
		<form th:action="@{/login}" th:object="${user}" method="post">
			<div class="form-group col-xs-5">
				<input type="text" name="username" id="username" th:field="*{_username}"
					class="form-control" required="true" placeholder="Username" />
			</div>
			<div class="form-group col-xs-5">
				<input type="password" name="password" id="password" th:field="*{_password}"
					class="form-control" required="true" placeholder="Password" />
			</div>
			<button type="submit" class="btn btn-info">
				<span class="glyphicon glyphicon-user"></span> Login
			</button>
			<br></br> <br></br>
		</form>
	</div>
</body>
</html>