package com.silencer.service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.silencer.dao.CustomerDAO;

import com.silencer.entity.Customer;


public class CustomerServices {
	private static int failOrOk;
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private CustomerDAO customerDAO;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	
	public CustomerServices(HttpServletRequest request, HttpServletResponse response) {
		
		this.request=request;
		this.response=response;
		entityManagerFactory = Persistence.createEntityManagerFactory("SilencerStoreProject");
		entityManager = entityManagerFactory.createEntityManager();
		customerDAO = new CustomerDAO(entityManager);
		
	}

	public void listCustomer() throws ServletException, IOException {
		listCustomer(null,0);
		
	}
	//int failOrOK send message to user_list with different format
	public void listCustomer(String message, int failOrOk) throws ServletException, IOException {

		List<Customer> listCustomers = customerDAO.listAll();
		
		request.setAttribute("listCustomer", listCustomers);
		
		if(message != null) {
			request.setAttribute("message", message);
			request.setAttribute("message2", failOrOk);
			
		}
		
		String listPage = "customer_list.jsp";
	    RequestDispatcher requestDispatcher = request.getRequestDispatcher(listPage);
	    requestDispatcher.forward(request, response);
		
		
	}


	
	  public void createCustomer(HttpServletRequest request, HttpServletResponse
	  response) throws ServletException, IOException {
	  
	  String fullName= request.getParameter("fullName");
	  String email= request.getParameter("email"); 
	  String phone= request.getParameter("phone");
	  String country= request.getParameter("country");
	  String zipCode= request.getParameter("zipCode");
	  String city= request.getParameter("city");
	  String address= request.getParameter("address");
	  String password= request.getParameter("password");
	  String discount=request.getParameter("discount");
	  

	  Customer existCustomer= customerDAO.findByEmail(email);
	  
	  if( existCustomer != null) {
	  
		  String message = "***Customer with email '"+ email + "' already exist***" ;
		  failOrOk=2;
		  
		  request.setAttribute("messageFailed", message); RequestDispatcher dispatcher
		  = request.getRequestDispatcher("customer_form.jsp");
		  dispatcher.forward(request, response);
	  
	  }else {
	  
		  Customer customer= new Customer(email,fullName,address,city,country,phone,zipCode,password,discount);
		  customerDAO.create(customer);
		  listCustomer("**Customer created successfully**",1);									
	  
	  
	  }
	  
	  }
	  
		
		  public void editCustomer() throws ServletException, IOException {
		  
		  int customerID= Integer.parseInt(request.getParameter("id"));
		  
		  Customer customer= customerDAO.get(customerID);
		  
		  if (customer != null) {
		  
			  request.setAttribute("customer", customer);
			  RequestDispatcher dispatcher= request.getRequestDispatcher("customer_form.jsp");
			  dispatcher.forward(request, response);
		  
		  
		  }else {
			  
			  listCustomer("***User with Id '"+ customerID +"' does not exist***", 2); 
			  
			  }
		  
		  }
		  
		  
			
			  public void updateCustomer() throws ServletException, IOException {
			  
				  String fullName= request.getParameter("fullName");
				  String email= request.getParameter("email"); 
				  String phone= request.getParameter("phone");
				  String country= request.getParameter("country");
				  String zipCode= request.getParameter("zipCode");
				  String city= request.getParameter("city");
				  String address= request.getParameter("address");
				  String password= request.getParameter("password");
				  String discount=request.getParameter("discount");
				  
				  int customerId = Integer.parseInt(request.getParameter("customerId"));
			
			  
				  Customer existCustomer= customerDAO.findByEmail(email);
			  

			  if (existCustomer != null && customerId != existCustomer.getCustomerId()) {
			  
				  listCustomer("***Can't update, Customer with email '"+ email +"' already exist***", 2);
			  
			  
			  }else{
			  
				  Customer customer = new Customer(customerId,email,fullName,address,city,country,phone,zipCode,password,discount);
				  customerDAO.update(customer);
				  listCustomer("**Customer updated successfully**",1);
			
			  }
			  
			  }

			public void deleteCustomer() throws ServletException, IOException {
				int customerId = Integer.parseInt(request.getParameter("id"));
				System.out.println(customerId);
				customerDAO.delete(customerId);
				listCustomer("**Customer deleted**",1);
				
			}
			  
				
			 
		 
	 

}
























