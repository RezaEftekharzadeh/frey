<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create User</title>
</head>
<body>
<jsp:include page="header.jsp" />
	<div align="center">
	     <h1>Create User</h1>
    </div>
    
    <div align="center">
    	<form action="create_user" method="post">
    	
    		<table>
    		
    			<tr>
    				<td>Email:</td>
    				<td><input type="text" name="email" size="20">
    			</tr>
    			<tr>
    				<td>Full Name:</td>
    				<td><input type="text" name="fullName" size="20">
    			</tr>
    			<tr>
    				<td>Password:</td>
    				<td><input type="password" name="password" size="20">
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