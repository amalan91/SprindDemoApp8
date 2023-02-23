<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
</head>
<body>
	<h2>All is Well - Hello World page - Student Information</h2>
	<hr>
	<p>Student First Name : ${student.firstName}<p>
	<br/>
	<p>Student Last Name : ${student.lastName}</p>
	<br/>
	<p>Student Country : ${student.country}</p>
	<br/>
	<p>Favorite Language : ${student.favoriteCourse}</p>
	<br/>
	<p>Known Languages :</p>
	<ul>
		<c:forEach var="temp" items="${student.knowLanguages}">
			<ul> ${temp} </ul>
		</c:forEach>
	</ul> 
	
	
</body>
</html>