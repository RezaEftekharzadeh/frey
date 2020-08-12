<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
 <!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"> -->
<meta charset="ISO-8859-1">
<title>List Users page</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div align="center">
	     <h1>List Customer Dashboard</h1>
	     <h3><a href="customer_form.jsp">Create New Customer</a></h3>
    </div>
    
    
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
   
 
    
	<div align="center">
		<table border="1" cellPadding="5" id="list">
			<tr>
				<th>index</th>
				<th>ID</th>
				<th>Email</th>
				<th>Full Name</th>
				<th>Country</th>
				<th>City</th>
				<th>Phone</th>
				<th>Register Date</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="customer" items="${listCustomer}" varStatus="status">
				<tr>
					<td>${status.index+1}</td>
					<td>${customer.customerId}</td>
					<td>${customer.email}</td>
					<td>${customer.fullName}</td>
					<td>${customer.country}</td>
					<td>${customer.city}</td>
					<td>${customer.phone}</td>
					
					<td>
						<a href="edit_customer?id=${customer.customerId}">Edit</a>
						<a href="javascript:confirmDelete(${customer.customerId})">Delete</a>
					</td>
				</tr>
			</c:forEach>
		
		</table>
		
	</div>
	<div align="center">
		<a href="javascript:fnExcelReport()">Download this table</a>
	</div>

	
     <jsp:include page="footer.jsp" />
     
     <script>
		function confirmDelete(userId){
		
			if(confirm('Are you sure that want to delete ' + customerId + '?')){
				
				window.location= 'delete_customer?id='+ customer.customerId ;
			}
		
		}
		
		function fnExcelReport(){
			
		    var tab_text="<table border='2px'><tr bgcolor='#87AFC6'>";
		    var textRange; var j=0;
		    tab = document.getElementById('list'); // id of table

		    for(j = 0 ; j < tab.rows.length ; j++) {     
		    	
		        tab_text=tab_text+tab.rows[j].innerHTML+"</tr>";
		        //tab_text=tab_text+"</tr>";
		    }

		    tab_text=tab_text+"</table>";
		    tab_text= tab_text.replace(/<A[^>]*>|<\/A>/g, "");//remove if u want links in your table
		    tab_text= tab_text.replace(/<img[^>]*>/gi,""); // remove if u want images in your table
		    tab_text= tab_text.replace(/<input[^>]*>|<\/input>/gi, ""); // reomves input params

		    var ua = window.navigator.userAgent;
		    var msie = ua.indexOf("MSIE "); 

		    if (msie > 0 || !!navigator.userAgent.match(/Trident.*rv\:11\./)) {     // If Internet Explorer
		    
		        txtArea1.document.open("txt/html","replace");
		        txtArea1.document.write(tab_text);
		        txtArea1.document.close();
		        txtArea1.focus(); 
		        sa=txtArea1.document.execCommand("SaveAs",true,"Say Thanks to Sumit.xls");
		    }  
		    else                 //other browser not tested on IE 11
		        sa = window.open('data:application/vnd.ms-excel,' + encodeURIComponent(tab_text));  

		    return (sa);
		}
	
	</script>
</body>
</html>