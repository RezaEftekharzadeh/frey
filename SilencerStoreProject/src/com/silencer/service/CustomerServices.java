package com.silencer.service;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.silencer.dao.CustomerDAO;
import com.silencer.dao.UserDAO;
import com.silencer.entity.Customer;
import com.silencer.entity.Users;

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
	  
	  
	  
	  
	  Customer existUser= customerDAO.findByEmail(email);
	  
	  if( existUser != null) {
	  
	  String message = "***Customer with email '"+ email + "' already exist***" ;
	  failOrOk=2;
	  
	  request.setAttribute("messageFailed", message); RequestDispatcher dispatcher
	  = request.getRequestDispatcher("customer_form.jsp");
	  dispatcher.forward(request, response);
	  
	  }else {
	  
	  Customer customer= new Customer(email,fullName,address,city,country,phone,zipCode,password);
	  customerDAO.create(customer);
	  listCustomer("**Customer created successfully**",1);
	  
	  
	  }
	  
	  }
	  
		/*
		 * public void editUser() throws ServletException, IOException {
		 * 
		 * int userID= Integer.parseInt(request.getParameter("id"));
		 * 
		 * Users user= userDAO.get(userID);
		 * 
		 * if (user != null) {
		 * 
		 * request.setAttribute("user", user); RequestDispatcher dispatcher=
		 * request.getRequestDispatcher("user_create.jsp"); dispatcher.forward(request,
		 * response);
		 * 
		 * 
		 * }else { listUser("***User with Id '"+ userID +"' does not exist***", 2); }
		 * 
		 * }
		 * 
		 * 
		 * public void updateUser() throws ServletException, IOException {
		 * 
		 * String email= request.getParameter("email"); String fullName=
		 * request.getParameter("fullName"); String password =
		 * request.getParameter("password"); int userId =
		 * Integer.parseInt(request.getParameter("userId"));
		 * 
		 * Users userByEmail = userDAO.findByEmail(email);
		 * 
		 * 
		 * 
		 * 
		 * if (userByEmail != null && userId != userByEmail.getUserId()) {
		 * 
		 * listUser("***Can't update, User with email '"+ email +"' already exist***",
		 * 2);
		 * 
		 * 
		 * }else{
		 * 
		 * Users user = new Users(userId, email, fullName, password);
		 * userDAO.update(user);
		 * 
		 * listUser("**User updated successfully**",1);
		 * 
		 * 
		 * }
		 * 
		 * }
		 * 
		 * public void deleteUser() throws ServletException, IOException { int userId =
		 * Integer.parseInt(request.getParameter("id")); userDAO.delete(userId);
		 * listUser("**User deleted**",1);
		 * 
		 * 
		 * }
		 */
	 

}
























