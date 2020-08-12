package com.silencer.controller.admin.users;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.silencer.entity.Users;
import com.silencer.service.UserServices;


@WebServlet("/admin/create_user")
public class CreateUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
 	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
 	
		UserServices userServices= new UserServices(request, response);
		userServices.createUser(request, response);
		

	}

}