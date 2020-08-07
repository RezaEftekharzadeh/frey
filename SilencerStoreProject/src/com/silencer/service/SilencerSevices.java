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

import com.silencer.dao.SilencerCoreSizeDAO;
import com.silencer.dao.SilencerDAO;
import com.silencer.dao.SilencerTreadSizeDAO;
import com.silencer.dao.UserDAO;
import com.silencer.entity.Silencer;
import com.silencer.entity.SilencerCoreSize;
import com.silencer.entity.SilencerTreadSize;
import com.silencer.entity.Users;

public class SilencerSevices {
	private static int failOrOk;
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private SilencerCoreSizeDAO silencerCoreSizeDAO;
	private SilencerTreadSizeDAO silencerTreadSizeDAO;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	
	public SilencerSevices(HttpServletRequest request, HttpServletResponse response) {
		
		this.request=request;
		this.response=response;
		entityManagerFactory = Persistence.createEntityManagerFactory("SilencerStoreProject");
		entityManager = entityManagerFactory.createEntityManager();
		silencerCoreSizeDAO = new SilencerCoreSizeDAO(entityManager);
		silencerTreadSizeDAO = new SilencerTreadSizeDAO(entityManager);
		
		
	}

	public void createTreadSilencer(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String tread = request.getParameter("tread");
		
		
		SilencerTreadSize silencerTreadSize= new SilencerTreadSize(tread);
		silencerTreadSizeDAO.create(silencerTreadSize);
	
	}
	
	public void createCoreSilencer(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String core = request.getParameter("core");

		SilencerCoreSize silencerCoreSize= new SilencerCoreSize(core);
		silencerCoreSizeDAO.create(silencerCoreSize);
	
	}
	


	
	 
	  
	 

	
	  
	 

}
