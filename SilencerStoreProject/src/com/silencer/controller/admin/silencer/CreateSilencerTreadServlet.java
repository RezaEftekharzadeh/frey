package com.silencer.controller.admin.silencer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.silencer.service.SilencerSevices;
import com.silencer.service.UserServices;

@WebServlet("/admin/create_silencer_tread")
public class CreateSilencerTreadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public CreateSilencerTreadServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SilencerSevices silencerServices= new SilencerSevices(request, response);
		silencerServices.createTreadSilencer(request, response);
		
		String indexPage= "silencer_form.jsp";
		RequestDispatcher requestDispatcher= request.getRequestDispatcher(indexPage);
		requestDispatcher.forward(request, response);
		
	}

}
