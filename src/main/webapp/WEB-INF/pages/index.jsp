<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/bootstrap.js" />"></script>
<script src="<c:url value="/resources/js/jquery-2.2.2.js" />"></script>
<script src="<c:url value="/resources/js/npm.js" />"></script>

</head>
<body>
	<div class="container">
		<h2 class="text-center">Add User</h2>
		<!--Search Form -->
		<form action="/user" method="get" id="addUser" role="form">
			<input type="hidden" id="addAction" name="addAction"
				value="addNewUser" />
			<div class="form-group col-xs-5">
				<input type="text" name="firstName" id="firstName"
					class="form-control" required="true" placeholder="First Name" />
			</div>
			<div class="form-group col-xs-5">
				<input type="text" name="lastName" id="lastName"
					class="form-control" required="true" placeholder="Last Name" />
			</div>
			<button type="submit" class="btn btn-info">
				<span class="glyphicon glyphicon-search"></span> Add
			</button>
			<br></br> <br></br>
		</form>
	</div>
</body>
</html>