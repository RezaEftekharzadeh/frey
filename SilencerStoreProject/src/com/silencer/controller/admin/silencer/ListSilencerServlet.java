package com.silencer.controller.admin.silencer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.silencer.service.SilencerServices;
import com.silencer.service.UserServices;

@WebServlet("/admin/list_silencer")
public class ListSilencerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ListSilencerServlet() {
        super();
        
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		SilencerServices silencerServices= new SilencerServices(request, response);
		silencerServices.listSilencer();
		
	}


}