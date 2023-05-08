<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="savedStudent" modelAttribute="Emp">
<%-- <form:input path="E_Id"/> --%>
<form:input path="E_Name"/>
<form:input path="E_PhNo"/>
<input type="submit" value="save">
</form:form>

</body>
</html>