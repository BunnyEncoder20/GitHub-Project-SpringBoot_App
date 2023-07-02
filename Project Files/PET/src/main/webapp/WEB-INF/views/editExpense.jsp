<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Expense</title>
</head>
<body>
	<h1>Edit Expense</h1>
	
	<form:form action="${contextRoot}/expense/${expense.id}" method="post" modelAttribute="expense">
		<form:input path="expensename" placeholder="Enter expense name" />
		<form:textarea path="amount" placeholder="Enter Cost" />
		<form:textarea path="note" placeholder="Enter Note (optional)" />
		
		<button type="submit">Update Expense</button>
	</form:form>
	
	<a href="${contextRoot}/expense/${expense.id}/delete">Delete</a>
	<a href="${contextRoot}/">Home</a>
</body>
</html>
