<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Silencer</title>
</head>
<body>

	<div align="center">
	
		<a href="silencer_form.jsp">Create New Silencer</a>
		
		<h4><i><p style="color:green;">${message}</p></i></h4>
		
		<table border="1" cellPadding="5" id="list">
			<tr>
				<th>index</th>
				<th>ID</th>
				<th>Tread Size</th>
				<th>Core Size</th>
				<th>Price</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="silencer" items="${listSilencer}" varStatus="status">
				<tr>
					<td>${status.index+1}</td>
					<td>${silencer.silencerId}</td>
					<td>${silencer.threadSize}</td>
					<td>${silencer.coreSize}</td>
					<td>${silencer.price}</td>
					<td>
						<a href="edit_user?id=${silencer.silencerId}">Edit</a>
						<a href="javascript:confirmDelete(${silencer.silencerId})">Delete</a>
					</td>
				</tr>
			</c:forEach>
		
		</table>
		
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