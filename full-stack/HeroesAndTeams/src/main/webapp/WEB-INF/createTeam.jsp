<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="/create-team" method="POST" modelAttribute="team">
		<div>
			<p>Name:</p>
			<form:label path="name"></form:label>
			<form:errors path="name"></form:errors>
			<form:input path="name"></form:input>
		</div>
		<p>
			<button type="submit">Create a team!</button>
		</p>
	
	</form:form>
	
	<c:forEach items="${teams}" var="team">
		<p><c:out value="${team.name }"></c:out></p>
	</c:forEach>
</body>
</html>