package com.silencer.controller.admin.silencer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.silencer.dao.SilencerDAO;
import com.silencer.entity.Silencer;
import com.silencer.service.SilencerServices;


@WebServlet("/frontend/shop_customer")
public class ShopCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ShopCustomerServlet() {
        super();
        
    }

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		SilencerServices silencerServices= new SilencerServices(request, response);
		silencerServices.listSilencer(null,0,0);
		System.out.println("shop customer called");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		for (int i =0; i<3;i++) {
		String tread= request.getParameter("tread_1");
		System.out.println(tread);
		}
		
	}

}
