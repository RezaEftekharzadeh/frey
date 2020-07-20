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

import com.silencer.dao.UserDAO;
import com.silencer.entity.Users;

public class UserServices {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private UserDAO userDAO;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	
	public UserServices(HttpServletRequest request, HttpServletResponse response) {
		this.request=request;
		this.response=response;
		entityManagerFactory = Persistence.createEntityManagerFactory("SilencerStoreProject");
		entityManager = entityManagerFactory.createEntityManager();
		userDAO = new UserDAO(entityManager);
		
	}

	public void listUser() throws ServletException, IOException {
		listUser(null);
		
	}
	public void listUser(String message) throws ServletException, IOException {
		
		List<Users> listUsers = userDAO.listAll();
		
		request.setAttribute("listUser", listUsers);
		
		if(message != null) {
		request.setAttribute("message", message);
		}
		
		String listPage = "user_list.jsp";
	    RequestDispatcher requestDispatcher = request.getRequestDispatcher(listPage);
	    requestDispatcher.forward(request, response);
		
		
	}


	public void createUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email= request.getParameter("email");
		String fullName= request.getParameter("fullName");
		String password= request.getParameter("password");
		
		Users existUser= userDAO.findByEmail(email);
		
		if( existUser != null) {
			
			String message = "***User with email '"+ email + "' already exist***" ;
			
			request.setAttribute("messageFailed", message);
			RequestDispatcher dispatcher = request.getRequestDispatcher("user_create.jsp");
			dispatcher.forward(request, response);
			
		}else {
			
			Users users= new Users(email, fullName, password);
			userDAO.create(users);
			listUser("**User created successfully**");
			
			 }
		
	}

	public void editUser() throws ServletException, IOException {
		
		int userID= Integer.parseInt(request.getParameter("id"));
		Users user= userDAO.get(userID);
		
		request.setAttribute("user", user);
		RequestDispatcher dispatcher= request.getRequestDispatcher("user_create.jsp");
		dispatcher.forward(request, response);
	}

	public void updateUser() {
		
		String email= request.getParameter("email");
		String fullName= request.getParameter("fullName");
		String password = request.getParameter("password");
		int userId = Integer.parseInt(request.getParameter("userId"));
		
		Users user = new Users(userId, email, fullName, password);
		userDAO.update(user);
		
		
		
	}

}























