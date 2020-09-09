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
import javax.servlet.http.HttpSession;

import com.silencer.dao.UserDAO;
import com.silencer.entity.Users;

public class UserServices {
	private static int failOrOk;
	private UserDAO userDAO;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	
	public UserServices(HttpServletRequest request, HttpServletResponse response) {
		
		this.request=request;
		this.response=response;
				
		userDAO = new UserDAO();
		
	}

	public void listUser() throws ServletException, IOException {
		listUser(null,0);
		
	}
	//int failOrOK send message to user_list with different format
	public void listUser(String message, int failOrOk) throws ServletException, IOException {
		
		
		
		List<Users> listUsers = userDAO.listAll();
		
		request.setAttribute("listUser", listUsers);
		
		if(message != null) {
			request.setAttribute("message", message);
			request.setAttribute("message2", failOrOk);
			
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
			failOrOk=2;
			
			request.setAttribute("messageFailed", message);
			RequestDispatcher dispatcher = request.getRequestDispatcher("user_create.jsp");
			dispatcher.forward(request, response);
			
		}else {
			
			Users users= new Users(email, fullName, password);
			userDAO.create(users);
			listUser("**User created successfully**",1);
			
			
			 }
		
	}

	public void editUser() throws ServletException, IOException {
		
		int userID= Integer.parseInt(request.getParameter("id"));
		
		Users user= userDAO.get(userID);
		
		
		if (user != null) {
			
			request.setAttribute("user", user);
			RequestDispatcher dispatcher= request.getRequestDispatcher("user_create.jsp");
			dispatcher.forward(request, response);
			
			
			  }else { 
				  listUser("**You do not have permission to edith/delete**", 2); }
	
	}
	

	public void updateUser() throws ServletException, IOException {
		
		String email= request.getParameter("email");
		String fullName= request.getParameter("fullName");
		String password = request.getParameter("password");
		int userId = Integer.parseInt(request.getParameter("userId"));
		
		Users userByEmail = userDAO.findByEmail(email);

		  if (userByEmail != null && userId != userByEmail.getUserId()) {
		
			  listUser("***Can't update, User with email '"+ email +"' already exist***", 2);

		  }else{
		  
			  Users user = new Users(userId, email, fullName, password);
			  userDAO.update(user);
			  
			  listUser("**User updated successfully**",1);
		  }

	}

	public void deleteUser() throws ServletException, IOException {
		int userId = Integer.parseInt(request.getParameter("id"));

		if(userId == 82 ) {

			listUser("**It is not allowed**", 2);

		}else {
			
			userDAO.delete(userId);
			listUser("**User deleted**",1);
		
		}
	}

	public void login() throws ServletException, IOException {
		String email= request.getParameter("email");
		String password = request.getParameter("password");
		
		
		
		boolean checkLogin= userDAO.checkLogin(email, password);
		
		if(checkLogin) {
			System.out.println("Login OK");
			Users userByEmail = userDAO.findByEmail(email);
			int userID = userByEmail.getUserId();
			
			request.getSession().setAttribute("userEmail", email);
			request.getSession().setAttribute("userID", userID );

			RequestDispatcher dispatcher = request.getRequestDispatcher("/admin/");
			dispatcher.forward(request,response);
			
		}else {
			
			request.setAttribute("message", "Email or Password is not correct");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request,response);
		}

	}
	public void logout() throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.removeAttribute("userEmail");
		session.removeAttribute("userID");
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);

	}
}
	
	
























