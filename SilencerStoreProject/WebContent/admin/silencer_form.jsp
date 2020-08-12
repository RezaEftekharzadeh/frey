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
		<c:if test = "${silencer != null}">
	     	<h1>Edit Silencer</h1>
	    </c:if>
	    
	    <c:if test="${silencer.silencerId == null}">
	     	<h1>Create Silencer</h1>
	    </c:if>
    </div>
        
    <div align="center">
    <h4><i><p style="color:green;">${message}</p></i></h4>
	    <c:if test = "${silencer != null}">
	    
		     	<form action="update_silencer" method="get" id="silencerForm">
		     	<input type="hidden" name = "silencerId" value= ${silencer.silencerId } >
		     	
		</c:if>
		    
		<c:if test = "${silencer.silencerId == null}">
		    
		     	<form action="create_silencer" method="post" id="silencerForm">
		     	
		</c:if>
    	
    	
    	<table >
    		
    			<tr>
    				<td align="right">Tread Size:</td>
    				<td><input type="text" name="tread" id="tread" size="45" value= ${silencer.threadSize }>
    			</tr>
    			<tr>
    				<td align="right">Core Size:</td>
    				<td><input type="text" name="core" id="core" size="45"  value= ${silencer.coreSize }>
    			</tr>
    			<tr>
    				<td align="right">Price:</td>
    				<td><input type="text" name="price" id="price" size="45"  value= ${silencer.price }>
    			</tr>
    			<tr align="right">
    				<td>Description:</td>
    				<td><textarea id="description" name="description" rows="4" cols="50"></textarea></td>
    			</tr>
    			<tr>
    				<td align="center">
    					<button type="submit" >Save</button>
    					&nbsp;&nbsp;&nbsp;&nbsp;
    					<button onclick="javascript:history.go(-1);" >Cancel</button>
    				</td>
    			</tr>
    		
    	 </table>
    	
    	</form>
    		
    </div>
	<!-- <div align="center" 11>
	
	
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
		
	</div> -->
	
	
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