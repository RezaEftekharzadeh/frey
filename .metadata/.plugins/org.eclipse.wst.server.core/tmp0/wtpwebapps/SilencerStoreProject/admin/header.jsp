
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div align="center">

	<div >
		 <img src="../images/admin-page.jpg">
	</div>
	
	<div >
	  Welcome, <c:out value="${sessionScope.userEmail }"></c:out> | <a href="logout">Logout</a>
	</div>
	<br><br>

	<div>
		<a href="list_users">Users</a> |
		<a href="list_silencer">suppressor</a> |
		<a href="list_customers">Customers</a> |
		<a href="reviews">Reviews</a> |
		<a href="orders">Orders</a> 
	</div>
</div>