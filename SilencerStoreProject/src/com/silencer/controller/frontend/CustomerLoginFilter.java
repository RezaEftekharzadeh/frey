package com.silencer.controller.frontend;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@WebFilter("/*")
public class CustomerLoginFilter implements Filter {

   
    public CustomerLoginFilter() {
       
    }

	
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException {
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		//it is false because I want to be by default false
		//we get the current session and the code does not create a new session if it does not exist!
		HttpSession session= httpRequest.getSession(false);
		
		String path = httpRequest.getRequestURI().substring(httpRequest.getContextPath().length());
		
		if (path.startsWith("/admin/")) {
			chain.doFilter(request, response);
			return;
		}
		
		boolean loggedIn = session != null && session.getAttribute("loggedInCustomer") != null;

		System.out.println("path " + path);
		System.out.println("loggedIn " + loggedIn);
		
		if(!loggedIn && path.startsWith("/view_profile")) {
			
			String loginPage = "/frontend/login.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(loginPage);
			dispatcher.forward(request, response);
			
		}else  {
			
			chain.doFilter(request, response);
			
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}



































