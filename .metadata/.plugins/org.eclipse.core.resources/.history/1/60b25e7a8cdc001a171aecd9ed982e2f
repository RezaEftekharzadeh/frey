package com.silencer.controller.admin.customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.silencer.service.CustomerServices;


@WebServlet("/admin/list_customers")
public class CustomerListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CustomerListServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		CustomerServices customerService = new CustomerServices(request, response);
		customerService.listCustomer();
	}



}
