<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="net.tanesha.recaptcha.ReCaptcha"%>
<%@ page import="net.tanesha.recaptcha.ReCaptchaFactory"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Customer Login</title>
	
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
<script src="https://www.google.com/recaptcha/api.js" async defer></script>

	<jsp:directive.include file="header.jsp" />
	
	<div align="center">
	
		<div >
			 
			 <h3>Customer login page</h3>
		</div>
		
		<c:if test="${message != null}">
		
			<div align="center">
				<h4><i><p style="color:red;">${message}</p></i></h4>
			</div>
	
		</c:if>

		<form action="login_customer" id="loginForm" method="post">
			
		<!-- 	<br/>
				<div class="g-recaptcha" data-sitekey="6Le81cAZAAAAAFWBTZZO6fvx0noa6ghCqq0cP60o"></div>
		    <br/>  -->
		
	      
			<table>
				<tr>
					<td align="right">Email:</td>
					
					<td align="left"><input type="text" name="email" id="email" size="20"></td>
				</tr>
				<tr>
					<td align="right">Password:</td>
					<td align="left"><input type="password" name="password" id="password" size="20"></td>
				</tr>
				
				<tr >
					<td colspan="2" align="center"  ><input type="submit" value="Login" size="20"></td>
				</tr>
		 
			</table>
	 
		</form>
	</div>
	<jsp:directive.include file="footer.jsp" />
<script type="text/javascript">
	
	$(document).ready(function() {
		$("#loginForm").validate({
			rules: {
				email: {
					required: true,
					email: true
				},
				
			    password: "required",
			    
			},
			
			messages: {
				
				email: {
					required: "Please enter email",
					email: "Please enter valid email"
				},
				
				password: "Please enter password"
			}
		});
		
		
	});


</script>


</body>
</html>