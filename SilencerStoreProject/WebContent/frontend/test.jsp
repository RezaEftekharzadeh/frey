<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Silencer</title>
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
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	
	
	        
	   
			    
			
	    	
	    	
	
	
		<div align="center">
			<table border="1" cellPadding="5" id="list">
				<tr>
					<th>index</th>
					<th>ID</th>
					<th>Tread Size</th>
					<th>Core Size</th>
					<th>Price</th>
					<th>Action</th>
				</tr>
				<c:forEach var="silencer" items="${listSilencer}" varStatus="status">
					<tr>
						<td>${status.index+1}</td>
						<td>${silencer.silencerId}</td>
						<td>${silencer.threadSize}</td>
						<td>${silencer.coreSize}</td>
						<td>${silencer.price}</td>
						<td>
							<a href="edit_silencer?id=${silencer.silencerId}">Edit</a>
							<a href="javascript:confirmDelete(${silencer.silencerId})">Delete</a>
						</td>
					</tr>
				</c:forEach>
			
			</table>
			
			  
			<select name="silencer">
			    <c:forEach var="silencer" items="${listSilencer}">
			        <option value="">${silencer.threadSize}</option>
			    </c:forEach>
			</select>
			
		</div>
		<jsp:include page="footer.jsp" />
		 <script>
			function confirmDelete(silencerId){
			
				if(confirm('Are you sure that want to delete ' + silencerId + '?')){
					
					window.location= 'delete_silencer?id='+ silencerId ;
				}
			
			}
		</script>
		
</body>
</html>