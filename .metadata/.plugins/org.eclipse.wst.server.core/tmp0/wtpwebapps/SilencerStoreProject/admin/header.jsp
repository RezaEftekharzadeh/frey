
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div align="center">

	<div >
		 <img src="../images/admin-page.jpg">
	</div>
	
	<div >
	  Welcome, <c:out value="${sessionScope.userEmail }"></c:out> | <a href="logout">Logout</a>
	  <c:set var= "userId" scope= "session" value="${sessionScope.userID }"></c:set> 
	</div>
	<br><br>

	<div>
		<c:if test="${userId == 82}"><a href="list_users">Users</a> |</c:if>
	    <a href="list_silencer">Suppressor</a> |
		<a href="list_customers">Customers</a> |
		<a href="reviews">Reviews</a> |
		<a href="list_order">Orders</a> 
		
	</div>
</div>