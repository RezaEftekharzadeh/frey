package com.silencer.controller.admin.silencer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.silencer.service.SilencerServices;


@WebServlet("/admin/create_silencer")
public class CreateSilencerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CreateSilencerServlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SilencerServices silencerServices= new SilencerServices(request, response);
		silencerServices.createSilencer(request, response);
		
	}

}