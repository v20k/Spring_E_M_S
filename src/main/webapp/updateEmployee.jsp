<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="ff"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ff:form  action="updatedEmployee" method="post" modelAttribute="em">
<ff:input path="E_Id" readonly="true"/>
<ff:input path="E_Name"/>
<ff:input path="E_PhNo"/>
<input type="submit" value="update">
</ff:form>

</body>
</html>