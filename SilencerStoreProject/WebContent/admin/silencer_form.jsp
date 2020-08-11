<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<h4><i><p style="color:green;">${message}</p></i></h4>
		<form action="create_silencer" method="post">
		
			Tread size:<input type="text" name="tread">
			<select>
				<option value>
			
			</select> 
			
			<br/><br/>

			Core size: <input type="text" name="core">
			<select>
				<option value>
			
			</select> 
			
			<br/><br/>
			
			price: <input type="text" name="price" size="10">
			
			<br/><br/>
			Description: <textarea id="w3review" name="description" rows="4" cols="50"></textarea>

			<br/><br/>
			
			<input type="submit" value="save">

		</form>
	</div>
	<div align="center">
		<table border="1" cellPadding="5" id="list">
			<tr>
				<th>index</th>
				<th>ID</th>
				<th>Tread Size</th>
				<th>Core Size</th>
				<th>Price</th>
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