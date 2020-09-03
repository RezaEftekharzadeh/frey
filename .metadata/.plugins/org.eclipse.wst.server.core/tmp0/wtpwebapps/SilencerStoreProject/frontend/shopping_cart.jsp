<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="net.tanesha.recaptcha.ReCaptcha"%>
<%@ page import="net.tanesha.recaptcha.ReCaptchaFactory"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Shopping cart</title>
	
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
			 
			 <h3>Your cart</h3>
			
		</div>
		<br/>
		
		<c:if test="${message != null}">
		
			<div align="center">
				<h3><i><p style="color:red;">${message}</p></i></h3>
			</div>
	
		</c:if>
		
		<form action="add_to_cart" method="get">
			
			<select name="silencer">
				    <c:forEach var="silencer" items="${listSilencer}">
				        <option value="">${silencer.price}</option>
				    </c:forEach>
			</select>
		
		
			<select name="silencerTread">
				    <c:forEach var="silencerTread" items="${listTreadSilencer}">
				        <option value="${silencerTread}">${silencerTread}</option>
				    </c:forEach>
			</select>
			
			<select name="silencerCore">
				    <c:forEach var="silencerCore" items="${listCoreSilencer}">
				        <option value="${silencerCore}">${silencerCore}</option>
				    </c:forEach>
			</select>
			
		
			<input type="text" name="total" placeholder="Total"/>
			<input type="text" name="idNum" placeholder="ID Number" size="20"/>
			<input type="submit" value="Add">
		</form>
		
		

		<c:set var="cart" value="${sessionScope['cart']}" />
		<c:set var="discount" value="${sessionScope['discount']}" />
		<c:set var="cartTotal" value="${cart.totalItems}" />
		<c:set var="afterDiscount" value="${sessionScope['afterDiscount']}" ></c:set>
		
		
		
		<c:if test="${cartTotal == 0 }">
		    <h2>Your cart is empty</h2>
		</c:if>
		
		 
		  <p id="test"></p>
		<c:if test="${cartTotal > 0 }">
		    <div>
		    	<form>
		    		<table border="1">
		    			<tr>
			    			<th>No</th>
			    			<th>Silencer</th>
			    			<th>Quantity</th>
			    			<th>Price ($)</th>
			    			<th>Your Discount</th>
			    			<th>Subtotal ($)</th>
			    			<th>After discount ($)</th>
			    			<th>
			    				<a href=""><b>Clear Cart</b></a>
			    			</th>
		    			</tr>
		    			<c:forEach items="${cart.items}" var="item" varStatus="status">
		    				<tr>
		    					<td>${status.index +1 }</td>
		    					<td>${item.key.threadSize}</td>
		    					<td align="center" >${item.value }</td>
		    					<td>${item.key.price}</td>
		    					<td align="center">${discount  } %</td>
		    					<td>${(item.value * item.key.price)} </td>
		    					<td>${afterDiscount * item.value}</td>
			    					
								
		    				</tr>
		    			</c:forEach>
		    		</table>
		    	</form>
		    </div>
		</c:if>
		
	</div>
	<jsp:directive.include file="footer.jsp" />
	
<script type="text/javascript">

	function percentage(num, per){
 
	  return (num/100)*per;
	}
	
	var x = percentage(10, 100);
	document.getElementById("disprice").innerHTML = x;
	

</script>




</body>
</html>