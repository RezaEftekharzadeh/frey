<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administration page</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div align="center">
	     <h1>Administration Dashboard</h1>
    </div>
    
    <div align="center">
    	<hr width=60%/>
    		<h2>Quick Action</h2>
		    	<b>
			    	<a href="create_suppressor">New Suppressor</a>&nbsp;
			    	<a href="create_user">New User</a>&nbsp;
			       	<a href="create_customer">New Customer</a>
		    	</b>
    </div>
    
	    
	<div align="center">
	    <hr width=60%/>
    	<h2>Recent Sales:</h2>
    </div>
    
 	<div align="center">
     	<hr width=60%/>
    	<h2>Recent Reviews:</h2>
    </div>
    
    <div align="center">
     	<hr width=60%/>
    	<h2>Statistics:</h2>
    </div>
     
     <jsp:include page="footer.jsp" />
</body>
</html>