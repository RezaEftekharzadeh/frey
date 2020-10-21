package com.silencer.controller.admin.silencer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.silencer.service.SilencerServices;


@WebServlet("/admin/delete_silencer")
public class DeleteSilencerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeleteSilencerServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SilencerServices silencerServices= new SilencerServices(request, response);
		silencerServices.deleteSilencer();
	}


}
