<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
	<div>
		<table border="1">
		    			<tr>
			    			<th>No</th>
			    			<th>Order ID</th>
			    			<th>Order by</th>
			    			<th>Quantity</th>
			    			<th>Caliber</th>
			    			<th>Code</th>
			    			<th>Quantity</th>
			    			<th>Order Date</th>
			    			<th>Action</th>
			    			
			    			
		    			</tr>
		    			
		    			<c:forEach items="${listOrder}" var="order" varStatus="status">
		    				<tr>
		    					<td>${status.index +3 }</td>
		    					<td align="center" >${order.orderId}</td>
		    					<td align="center" >${order.customer.fullName}</td>
		    					<td align="center" >${order.orderId}</td>
		    					<td align="center" >${order.orderId}</td>
		    					<td align="center" >${order.orderId}</td>
		    					<td align="center" >
		    						<a href="view_order?id=${order.orderId}">Details</a>&nbsp;
		    						<a href="edit?id=">Edit</a>&nbsp;
		    						<a href="">Delete</a>&nbsp;
		    					
		    					</td>
		    					
			    					
								
		    				</tr>
		    			</c:forEach>
		    		</table>
	
	
	</div>
</body>
</html>