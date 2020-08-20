package com.silencer.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/admin/")
public class AdminHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminHomeServlet() {
        super();
       
    }
	
	  
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			  throws ServletException, IOException { 
		  doGet(req, resp);
		  
	  }


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String indexPage= "index.jsp";
		RequestDispatcher requestDispatcher= request.getRequestDispatcher(indexPage);
		requestDispatcher.forward(request, response);
		
	}


}
