<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create User</title>
</head>
<body>
<jsp:include page="header.jsp" />


	<div align="center">
		<c:if test = "${user != null}">
	     	<h1>Edit User</h1>
	    </c:if>
	    
	    <c:if test="${user.userId == null}">
	     	<h1>Create User</h1>
	    </c:if>
    </div>
    
    <div align="center">
    
    	<h3><p style="color:red;">${messageFailed}</p></h3>
    	
    	
    </div>
    
    <div align="center">
    <c:if test = "${user != null}">
    
	     	<form action="update_user" method="post">
	     	<input type="hidden" name = "userId" value= ${user.userId } >
	    </c:if>
	    
	    <c:if test = "${user.userId == null}">
	    
	     	<form action="create_user" method="post">
	     	
	    </c:if>
    	
    	
    		<table>
    		
    			<tr>
    				<td>Email:</td>
    				<td><input type="text" name="email" size="20" value= ${user.email }>
    			</tr>
    			<tr>
    				<td>Full Name:</td>
    				<td><input type="text" name="fullName" size="20"  value= ${user.fullName }>
    			</tr>
    			<tr>
    				<td>Password:</td>
    				<td><input type="password" name="password" size="20"  value= ${user.password }>
    			</tr>
    			<tr>
    				<td><input type="submit" value="save"></td>
    			</tr>
    		
    		</table>
    	
    	</form>
    		
    </div>

     <jsp:include page="footer.jsp" />
</body>
</html>