<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add User</title>

<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/bootstrap.js" />"></script>
<script src="<c:url value="/resources/js/jquery-2.2.2.js" />"></script>
<script src="<c:url value="/resources/js/npm.js" />"></script>

</head>
<body>
	<div class="container">
		<h2 class="text-center">Add User</h2>
		<!--Search Form -->
		<form th:action="@{/index}" th:object="${user}" method="post">
			<div class="form-group col-xs-5">
				<input type="text" name="firstName" id="firstName"
					class="form-control" required="true" placeholder="First Name" th:field="*{_firstName}" value="${user.firstName}" />
			</div>
			<div class="form-group col-xs-5">
				<input type="text" name="lastName" id="lastName"
					class="form-control" required="true" placeholder="Last Name" th:field="*{_lastName}" value="${user.lastName}" />
			</div>
			<div class="form-group col-xs-5">
				<input type="text" name="username" id="username"
					class="form-control" required="true" placeholder="Username" th:field="*{_username}" value="${user.username}" />
			</div>
			<div class="form-group col-xs-5">
				<input type="password" name="password" id="password"
					class="form-control" required="true" placeholder="Password" th:field="*{_password}" />
			</div>
			<button type="submit" class="btn btn-info">
				<span class="glyphicon glyphicon-user"></span> Add
			</button>
			<br></br> <br></br>
		</form>
	</div>
</body>
</html>