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

import com.silencer.dao.SilencerDAO;
import com.silencer.dao.UserDAO;
import com.silencer.entity.SilencerSize;
import com.silencer.entity.Users;

public class SilencerSevices {
	private static int failOrOk;
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private SilencerDAO silencerDAO;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	
	public SilencerSevices(HttpServletRequest request, HttpServletResponse response) {
		
		this.request=request;
		this.response=response;
		entityManagerFactory = Persistence.createEntityManagerFactory("SilencerStoreProject");
		entityManager = entityManagerFactory.createEntityManager();
		silencerDAO = new SilencerDAO(entityManager);
		
	}

	public void listUser() throws ServletException, IOException {
		listSilencer(null,0);
		
	}
	//int failOrOK send message to silencer_list with different format
	public void listSilencer(String message, int failOrOk) throws ServletException, IOException {
		
		
		
		List<SilencerSize> listsilencer = silencerDAO.listAll();
		
		request.setAttribute("listUser", listsilencer);
		
		if(message != null) {
			request.setAttribute("message", message);
			request.setAttribute("message2", failOrOk);
			
		}
		
		String listPage = "user_list.jsp";
	    RequestDispatcher requestDispatcher = request.getRequestDispatcher(listPage);
	    requestDispatcher.forward(request, response);
		
		
	}


	public void createSilencer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tread= request.getParameter("tread");
		String core= request.getParameter("core");
		
		
		/*
		 * Users existUser= userDAO.findByEmail(email);
		 * 
		 * if( existUser != null) {
		 * 
		 * String message = "***User with email '"+ email + "' already exist***" ;
		 * failOrOk=2;
		 * 
		 * request.setAttribute("messageFailed", message); RequestDispatcher dispatcher
		 * = request.getRequestDispatcher("user_create.jsp");
		 * dispatcher.forward(request, response);
		 * 
		 * }else {
		 */
			
		SilencerSize silencerSize= new SilencerSize(tread, core);
		silencerDAO.create(silencerSize);
			//listSilencer("**User created successfully**",1);
			
			
			// }
		
	}

	/*
	 * public void editSilencer() throws ServletException, IOException {
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
	 * }else { listSilencer("***User with Id '"+ userID +"' does not exist***", 2);
	 * }
	 * 
	 * }
	 */

	/*
	 * public void updateSilencer() throws ServletException, IOException {
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
	 * listSilencer("***Can't update, User with email '"+ email
	 * +"' already exist***", 2);
	 * 
	 * 
	 * }else{
	 * 
	 * Users user = new Users(userId, email, fullName, password);
	 * userDAO.update(user);
	 * 
	 * listSilencer("**User updated successfully**",1);
	 * 
	 * 
	 * }
	 * 
	 * }
	 * 
	 * public void deleteSilencer() throws ServletException, IOException { int
	 * userId = Integer.parseInt(request.getParameter("id"));
	 * userDAO.delete(userId); listSilencer("**User deleted**",1);
	 * 
	 * 
	 * }
	 */

}
