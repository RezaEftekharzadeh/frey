<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<div align="center">
		<form action="create_silencer_tread" method="post">
		
			Tread size:<input type="text" name="tread">
			
			<input type="submit" value="save">
			
			<br/><br/>
			
			<select>
				<option value>
			
			</select> 
			
		
	
		</form>
		<form action="create_silencer_core" method="post">
		
			
			Core size: <input type="text" name="core">
			
			<input type="submit" value="save">
			
			<br/><br/>
			
			<select>
				<option value>
			
			</select> 
			
			
	
		</form>
	</div>

</body>
</html>