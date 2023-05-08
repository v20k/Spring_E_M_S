<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
<tr> 
<th>Emp_Id</th><th>Emp_Name</th><th>Emp_Phone_No</th><th>Update</th><th>Delete</th>
</tr>
<f:forEach var="E" items="${emp}" >

<tr><td>${E.getE_Id()}</td>
<td>${E.getE_Name()}</td><td>${ E.getE_PhNo()}</td>
<td><a href="updateEmployee?VinothID=${E.getE_Id()}">update</a></td>
<td><a href="deleteEmployee?VasanthID=${E.getE_Id()}">delete</a></td></tr>

</f:forEach>


</table>

</body>
</html>