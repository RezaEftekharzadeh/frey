package com.silencer.controller.frontend.shoppingcart;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.silencer.dao.SilencerDAO;
import com.silencer.entity.Silencer;
import com.silencer.service.SilencerServices;


@WebServlet("/add_to_cart")
public class AddSilencerToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
   
    public AddSilencerToCartServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String tread = request.getParameter("silencerTread");
		String core = request.getParameter("silencerCore");
		String name = request.getParameter("silencerName");
		String caliber = request.getParameter("silencerCaliber");
		int total = Integer.parseInt(request.getParameter("total"));
		
		Object cartObject = request.getSession().getAttribute("cart");
		ShoppingCart shoppingCart=null;
		
		if(cartObject !=null && cartObject instanceof ShoppingCart) {
			
			//we can find that session is for same customer or not 
			 shoppingCart = (ShoppingCart) cartObject;

		}else {
			shoppingCart = new ShoppingCart();
			request.getSession().setAttribute("cart", shoppingCart);
			
		 } 
		
			SilencerDAO silencerDAO = new SilencerDAO();
			
			Silencer silencer = silencerDAO.findSilencer(tread,core,name,caliber);
			
			if(silencer != null) {
			shoppingCart.addItem(silencer, total);
			}else {
				request.setAttribute("massage", "This silencer isn't a standard size, please contact with help desk");
				RequestDispatcher dispatcher = request.getRequestDispatcher("view_cart");
				 dispatcher.forward(request, response);
			}

			
			String redirectURL = request.getContextPath().concat("/view_cart");
			response.sendRedirect(redirectURL);

		
		
		 }

}
