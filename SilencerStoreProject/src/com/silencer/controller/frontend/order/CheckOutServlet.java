package com.silencer.controller.frontend.order;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.silencer.service.OrderServices;


@WebServlet("/checkout")
public class CheckOutServlet extends HttpServlet {
	

	private static final long serialVersionUID = 1L;
       
    
    public CheckOutServlet() {
        super();
       
    }
    
    @Override
	protected void doPost(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
		
    	OrderServices orderService = new OrderServices(requset,response);
    	orderService.showCheckOutForm();
    	
	}

	

}
