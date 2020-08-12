<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Create User</title>
	
	<script 
			src="https://code.jquery.com/jquery-3.3.1.min.js" 
			integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" 
			crossorigin="anonymous">
	</script>
	
	<script 
			src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.2/jquery.validate.min.js" 
			integrity="sha512-UdIMMlVx0HEynClOIFSyOrPggomfhBKJE28LKl8yR3ghkgugPnG6iLfRfHwushZl1MOPSY6TsuBDGPK2X4zYKg==" 
			crossorigin="anonymous">
	</script>
	
</head>
<body>
<jsp:include page="header.jsp" />


	<div align="center">
		<c:if test = "${customer != null}">
	     	<h1>Edit Customer</h1>
	    </c:if>
	    
	    <c:if test="${customer == null}">
	     	<h1>Create Customer</h1>
	    </c:if>
    </div>
    
    <div align="center">
    
    	<h3><p style="color:red;">${messageFailed}</p></h3>
    	
    </div>
    
    <div align="center">
    
	    <c:if test = "${customer != null}">
	    
		     	<form action="update_customer" method="post" id="customerForm">
		     	<input type="hidden" name = "userId" value= ${user.userId } >
		     	
		</c:if>
		    
		<c:if test = "${user.userId == null}">
		    
		     	<form action="create_customer" method="post" id="customerForm">
		     	
		</c:if>
    	
    	
    	<table >
    	
    			<tr >
    				<td align="right">Full Name:</td>
    				<td><input type="text" name="fullName" id="fullName" size="45" value= ${customer.fullName }>
    			</tr>
    			<tr >
    				<td align="right">Email:</td>
    				<td><input type="text" name="email" id="email" size="45"  value= ${customer.email }>
    			</tr>
    				<tr >
    				<td align="right">Phone:</td>
    				<td><input type="tel" name="phone" id="phone" size="45"  value= ${customer.phone }>
    			</tr>
    			<tr >
    				<td align="right">County:</td>
    				<td><input type="text" name="country" id="country" size="45"  value= ${customer.county }>
    			</tr>
    			<tr >
    				<td align="right">City:</td>
    				<td><input type="text" name="city" id="city" size="45"  value= ${customer.city }>
    			</tr>
    				<tr >
    				<td align="right">ZipCode:</td>
    				<td><input type="text" name="zipCode" id="zipCode" size="45"  value= ${customer.zipCode }>
    			</tr>
    		
    			<tr >
    				<td align="right">Address:</td>
    				<td><input type="text" name="address" id="address" size="45" value= ${customer.address }>
    			</tr>
    			
    			<tr >
    				<td align="right">Password:</td>
    				<td><input type="password" name="password" id="password" size="45"  value= ${customer.password }>
    			</tr>
    			<tr >
    				<td align="right">Confirm Password:</td>
    				<td><input type="password" name="confirmpassword" id="confirmpassword" size="45"  value= ${customer.password }>
    			</tr>
    			<tr >
    				<td align="right">
    					<button type="submit" >Save</button>&nbsp;&nbsp;&nbsp;&nbsp;
    					<button onclick="javascript:history.go(-1);" >Cancel</button>
    				</td>
    			</tr>
    		
    	 </table>
    	
    	</form>
    		
    </div>
    
<script type="text/javascript">

    $(document).ready(function() {
		$("#customerForm").validate({
			rules: {
				email: {
					required: true,
					email: true
				},
				
				fullName: "required",
				phone: "required",
			    password: "required",
			    
			    
			},
			
			messages: {
				
				email: {
					required: "Please enter email",
					email: "Please enter valid email"
				},
				
				fullName: "Please enter Full Name",
				phone: "Please enter phone",
				password: "Please enter password"
				
			
			}
		});
		
		
	});
</script>

     <jsp:include page="footer.jsp" />
</body>
</html>