<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:directive.include file="header.jsp" />

	<div align="center">
	
		<h3><p style= "color: green">${message}</p></h3>
		
		<form action="" method="get">
		
			 <input type="submit" value="Sign In in your profile">
		
		</form>
	
	
	</div>

<jsp:directive.include file="footer.jsp" />

</body>
</html>