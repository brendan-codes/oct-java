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
	<h1>Add power to <c:out value="${hero.name}"></c:out></h1>
	

		<p style="color: red;" > <c:out value="${error}"></c:out></p>

	
	<c:forEach items="${hero.getPowers()}" var="power">
		<p><c:out value="${power.name}"></c:out></p>
		<form action="/remove-power/${power.id}" method="POST">
			<input type="hidden" value="${hero.id}" name="hero_id">
			<button type="submit">remove <c:out value="${power.name}"></c:out></button>
		</form>
	</c:forEach>

	<form action="/add-power/${hero.id}" method="POST">
	
		<select name="power_id">
			<option selected disabled>pick a power</option>
			<c:forEach items="${powers}" var="p">
				<option value="${p.getId()}">
					<c:out value="${p.name}"></c:out>
				</option>
			</c:forEach>
		</select>
		
		<p>
			<button type="submit">Add a power to <c:out value="${hero.name}"></c:out></button>
		</p>
	
	</form>
</body>
</html>