package com.silencer.controller.admin.silencer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/frontend/shop_customer")
public class ShopCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ShopCustomerServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tread= request.getParameter("tread");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println(tread);
	}

}