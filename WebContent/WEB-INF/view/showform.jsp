<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Form</title>
<style>
	.error{
		color: #f00;
	}
</style>
</head>
<body>
	<h2>All is Well - Registration Form</h2>
	<hr>
	<br/>
	
	<form:form action="processForm" modelAttribute="student">
		
		First Name&nbsp;&nbsp;&nbsp;;&nbsp;: <form:input path="firstName"/> <br/><br/>
		
		Last Name(*): <form:input path="lastName" /> 
		<form:errors path="lastName" cssClass="error"></form:errors>
		<br/><br/>
		Countries : 
		<form:select path="country"> 
			<form:options items="${student.countriesList}"></form:options>
		</form:select> <br/><br/>
		
		Java <form:radiobutton path="favoriteCourse" value="Java" />
		C# <form:radiobutton path="favoriteCourse" value="C-sharp" />
		PHP <form:radiobutton path="favoriteCourse" value="Php" />
		Python <form:radiobutton path="favoriteCourse" value="Python" />
		.net <form:radiobutton path="favoriteCourse" value="DotNet" />
		
		<br/><br/>
		
		<form:checkbox path="knowLanguages" value="java" /> Java
		<form:checkbox path="knowLanguages" value="php" /> PHP
		<form:checkbox path="knowLanguages" value="python" /> PYTHON
		<form:checkbox path="knowLanguages" value="cplus" /> C++
		
		<br/><br/>
		
		<form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error"></form:errors>
		
		<br/><br/>
		
		<input type="submit" value="submit" />
	</form:form>
	
	
</body>
</html>