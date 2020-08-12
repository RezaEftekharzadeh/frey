package com.silencer.controller.admin.silencer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.silencer.service.SilencerServices;


@WebServlet("/admin/update_silencer")
public class UpdateSilencerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public UpdateSilencerServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SilencerServices silencerService = new SilencerServices(request, response);
		silencerService.updateSilencer();
		
	}

}
