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
import com.silencer.entity.Silencer;
import com.silencer.entity.Users;

public class SilencerServices {
	private static int failOrOk;
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private SilencerDAO silencerDAO;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	
	public SilencerServices(HttpServletRequest request, HttpServletResponse response) {
		
		this.request=request;
		this.response=response;
		entityManagerFactory = Persistence.createEntityManagerFactory("SilencerStoreProject");
		entityManager = entityManagerFactory.createEntityManager();
		silencerDAO = new SilencerDAO(entityManager);
		
		
		
	}

	public void createSilencer(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		String tread = request.getParameter("tread");
		String core = request.getParameter("core");
		float price = Integer.parseInt(request.getParameter("price"));
		
		
		Silencer silencer= new Silencer(tread,core,price);
		silencerDAO.create(silencer);
		
		String message= "Silencer created";
		listSilencer(message,0,1);

	}
	

	public void listSilencer() throws ServletException, IOException {
		listSilencer(null,0,1);
		
	}
	//int failOrOK send message to user_list with different format
	public void listSilencer(String message, int failOrOk , int admin) throws ServletException, IOException {

		List<Silencer> listSilencer = silencerDAO.listAll();
		
		request.setAttribute("listSilencer", listSilencer);
		
		if(message != null) {
			request.setAttribute("message", message);
			request.setAttribute("message2", failOrOk);
			
		}
		String indexPage=null;
		if(admin == 1) {
			indexPage= "silencer_form.jsp";
		}else {
			indexPage= "frontend/shopping_cart.jsp";
		}
		
		RequestDispatcher requestDispatcher= request.getRequestDispatcher(indexPage);
		requestDispatcher.forward(request, response);
		
	}
	
	public void pureListSilencer() {
		
		List<Silencer> listTreadSilencer = silencerDAO.listTread();
		List<Silencer> listCoreSilencer = silencerDAO.listCore();
		
		request.setAttribute("listTreadSilencer", listTreadSilencer);	
		request.setAttribute("listCoreSilencer", listCoreSilencer);	
	}
	
	public void deleteSilencer() throws ServletException, IOException {
		int userId = Integer.parseInt(request.getParameter("id"));
		silencerDAO.delete(userId);
		listSilencer("**Silencer deleted**",0,1);
		
		
	}
	public void editSilencer() throws ServletException, IOException {
		
		int silencerID= Integer.parseInt(request.getParameter("id"));
		
		Silencer silencer= silencerDAO.get(silencerID);
		
		if (silencer != null) {
			
			request.setAttribute("silencer", silencer);
			RequestDispatcher dispatcher= request.getRequestDispatcher("silencer_form.jsp");
			dispatcher.forward(request, response);
			
			
			  }else { 
				  listSilencer("***Silencer with Id '"+ silencerID +"' does not exist***", 2,1); }
	
	}
	

	public void updateSilencer() throws ServletException, IOException {
		
		String tread = request.getParameter("tread");
		String core = request.getParameter("core");
		float price = Integer.parseInt(request.getParameter("price"));
		int silencerId= Integer.parseInt(request.getParameter("silencerId"));

		  
			  Silencer silencer = new Silencer(silencerId, tread, core, price);
			  silencerDAO.update(silencer);
			  
			  listSilencer("**Silencer updated successfully**",1,1);

	}

}


