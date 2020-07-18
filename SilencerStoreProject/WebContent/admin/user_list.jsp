<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
 <!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"> -->
<meta charset="ISO-8859-1">
<title>List Users page</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div align="center">
	     <h1>List User Dashboard</h1>
	     <h3><a href="user_create.jsp">Create New User</a></h3>
    </div>
    
	<div align="center">
		<table border="1" cellPadding="5">
			<tr>
				<th>index</th>
				<th>Email</th>
				<th>Full Name</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="user" items="${listUser}" varStatus="status">
				<tr>
					<td>${status.index+1}</td>
					<td>${user.email}</td>
					<td>${user.fullName}</td>
					<td>
						<a href="">Edith</a>
						<a href="">Delete</a>
					</td>
				</tr>
			</c:forEach>
		
		</table>
		
	</div>
	
	
     <jsp:include page="footer.jsp" />
</body>
</html>