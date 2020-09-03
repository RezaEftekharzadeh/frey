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
			<c:if test = "${silencer != null}">
		     	<h1>Edit Silencer</h1>
		    </c:if>
		    
		    <c:if test="${silencer.silencerId == null}">
		     	<h1>Create Silencer</h1>
		    </c:if>
	    </div>
	        
	    <div align="center">
	    <c:if test="${ message != null }">
	    	<c:if test="${ message2 == 1 }">
	    	
			    <div align="center">
			    	<h4><i><p style="color:green;">${message}</p></i></h4>
			    	
			    </div>
	   		
	   		</c:if>
	    </c:if>
	  
	     <c:if test="${ message != null }">
	    	<c:if test="${ message2 == 2 }">
	    	
			    <div align="center">
			    	<h4><i><p style="color:red;">${message}</p></i></h4>
			    	
			    </div>
	   		
	   		</c:if>
    </c:if>
		    <c:if test = "${silencer != null}">
		    
			     	<form action="update_silencer" method="get" id="silencerForm">
			     	<input type="hidden" name = "silencerId" value= ${silencer.silencerId } >
			     	
			</c:if>
			    
			<c:if test = "${silencer.silencerId == null}">
			    
			     	<form action="create_silencer" method="post" id="silencerForm">
			     	
			</c:if>
	    	
	    	
	    	<table >
	    	
	    			<tr>
	    				<td align="right">Name:</td>
	    				<td><input type="text" name="name" id="tread" size="45" value= ${silencer.name }>
	    			</tr>
	    		
	    			<tr>
	    				<td align="right">Model:</td>
	    				<td><input type="text" name="tread" id="tread" size="45" value= ${silencer.threadSize }>
	    			</tr>
	    			
	    			<tr>
	    				<td align="right">Core Size:</td>
	    				<td><input type="text" name="core" id="core" size="45"  value= ${silencer.coreSize }>
	    			</tr>
	    			
	    			<tr>
	    				<td align="right">Caliber:</td>
	    				<td><input type="text" name="caliber" id="caliber" size="45"  value= ${silencer.caliber }>
	    			</tr>
	    			
	    			<tr>
	    				<td align="right">Code:</td>
	    				<td><input type="text" name="code" id="code" size="45"  value= ${silencer.code }>
	    			</tr>
	    			
	    			<tr>
	    				<td align="right">Price:</td>
	    				<td><input type="text" name="price" id="price" size="45"  >
	    			</tr>
	    			
	    			<tr align="right">
	    				<td>Description:</td>
	    				<td><textarea id="description" name="description" rows="4" cols="50"></textarea></td>
	    			</tr>
	    			
	    			<tr>
	    				<td align="center">
	    					<button type="submit" >Save</button>
	    					&nbsp;&nbsp;&nbsp;&nbsp;
	    					
	    				</td>
	    			</tr>
	    		
	    	 </table>
	    	
	    	</form>
	    	
	    	<c:if test = "${silencer != null}">
	    		<button onclick="javascript:history.go(-1);" >Cancel</button>
	    	
	    	</c:if>
	    		
	    </div>
	    <br/><br/>
	
		<div align="center">
			<table border="1" cellPadding="5" id="list">
				<tr>
					<th>index</th>
					<th>ID</th>
					<th>Name</th>
					<th>Model</th>
					<th>Core Size</th>
					<th>Caliber</th>
					<th>Code</th>
					<th>Price</th>
					<th>Action</th>
				</tr>
				<c:forEach var="silencer" items="${listSilencer}" varStatus="status">
					<tr>
						<td>${status.index+1}</td>
						<td>${silencer.silencerId}</td>
						<td>${silencer.name}</td>
						<td>${silencer.threadSize}</td>
						<td>${silencer.coreSize}</td>
						<td>${silencer.caliber}</td>
						<td>${silencer.code}</td>
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
		<script type="text/javascript">
		
		    $(document).ready(function() {
				$("#silencerForm").validate({
					rules: {
						tread: "required",
						core: "required",
						code: "required",
						caliber: "required",
						price: {
							required: true,
							number: true
						},

					},
					
					messages: {
																
						tread: "Please enter Tread Size",
						core: "Please enter Core Size",
						code: "Please enter uniqe Code for silencer",
						caliber: "Please enter Caliber",
						price: {
							required: "Please enter price",
							number: "please enter valid price"
							
						},
												
					}
				});
				
				
			});
		</script>
</body>
</html>