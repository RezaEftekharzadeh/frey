package com.silencer.controller.frontend.shoppingcart;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.silencer.service.SilencerServices;


@WebServlet("/find_by_code")
public class FindSilencerByCode extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FindSilencerByCode() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String code = request.getParameter("code");
		SilencerServices silencerService= new SilencerServices(request , response);
		silencerService.searchWithCode(code);
	}

}
