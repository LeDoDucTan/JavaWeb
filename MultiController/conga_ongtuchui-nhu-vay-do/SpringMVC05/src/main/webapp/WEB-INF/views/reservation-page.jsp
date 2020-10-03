<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reservation From</title>
</head>
 <h1>Railway Registration From</h1>
<body>
	<form:form  action="submitFrom" modelAttribute="reservation" >
		First name:<form:input path ="firstName"/>
		<br><br>
		Last name:<form:input path ="lastName"/>
		<br><br>
		Gender:
		Male<form:radiobutton path ="Gender" value="Male"/>
		Female<form:radiobutton path ="Gender" value="Female"/>
		<br><br>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>