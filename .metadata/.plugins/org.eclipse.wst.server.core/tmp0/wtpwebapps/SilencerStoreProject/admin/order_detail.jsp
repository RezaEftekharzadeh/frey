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
<jsp:include page="header.jsp" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	
	<div align="center">
		<h2> Details of ${order.customer.fullName}</h2>
	</div>
	<div align = "center">
		<table border="1">
		    			<tr>
			    			<th>No</th>
			    			<th>Name</th>
			    			<th>Model</th>
			    			<th>Core Size</th>
			    		 	<th>Caliber</th>
			    		 	<th>Code</th>
			    			<th>Quantity</th>
			    			<th>Produce Now</th>
			    			<th>Remain</th>
			    			<th>Action</th>
			    			
			    			
			    			
			    			
		    			</tr>
		    			
		    			<c:forEach items="${order.orderDetails}" var="orderDetail" varStatus="status">
		    				<tr>
		    					<td>${status.index +3 }</td>
		    					<td align="center" >${orderDetail.silencer.name}</td>
		    					<td align="center" >${orderDetail.silencer.threadSize}</td>
		    					<td align="center" >${orderDetail.silencer.coreSize}</td>
		    					<td align="center" >${orderDetail.silencer.caliber}</td>
		    					<td align="center" >${orderDetail.silencer.code}</td>
		    					<td align="center" >${orderDetail.quantity}</td>
		    					<td align="center" >
		    						<input type="text" size="4">
		    					</td>
		    					<td align="center" >${orderDetail.quantity}</td>
		    					
		    					<td align="center" >
		    						<a href="edit?id=">Edit</a>&nbsp;
		    						<a href="">Delete</a>&nbsp;
		    					
		    					</td>
		    					
			    					
								
		    				</tr>
		    			</c:forEach>
		    		</table>
	
	
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>