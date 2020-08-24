<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
<jsp:include page="header.jsp" />


	<div align="center">
	
		<h3><p style= "color: green">${message}</p></h3>
		
		<h4></h4>

	</div>

<jsp:directive.include file="footer.jsp" />

</body>
</html>