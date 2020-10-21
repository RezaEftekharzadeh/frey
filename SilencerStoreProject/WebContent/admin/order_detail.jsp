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
		<table border="1" cellPadding="5" id="list">
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
	
		<div align="center">
			<a href="javascript:fnExcelReport()">Download this table</a>
		</div>
	
	<jsp:include page="footer.jsp" />
	
	 <script>
	/* 	function confirmDelete(customerId){
		
			if(confirm('Are you sure that want to delete ' + customerId + '?')){
				
				window.location= 'delete_customer?id='+ customerId ;
			}
		
		} */
		
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