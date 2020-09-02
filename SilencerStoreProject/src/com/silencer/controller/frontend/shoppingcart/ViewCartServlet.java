package com.silencer.controller.frontend.shoppingcart;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.silencer.entity.Customer;
import com.silencer.entity.Silencer;
import com.silencer.service.SilencerServices;


@WebServlet("/view_cart")
public class ViewCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ViewCartServlet() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Object cartObject = request.getSession().getAttribute("cart");
		Customer customer = (Customer) request.getSession().getAttribute("loggedInCustomer");
		double discount = Integer.parseInt(customer.getDiscount());
		request.getSession().setAttribute("discount", discount);
		
		if(cartObject == null) {
			ShoppingCart shoppingCart = new ShoppingCart();
			request.getSession().setAttribute("cart", shoppingCart);
		}else {
			/*
			 * for (Map.Entry<Silencer, Integer> entry: cart.entrySet()) {
			 * 
			 * }
			 */
		}
		
		Silencer silencer =new Silencer();
		silencer.setThreadSize("feather weight 149");
		silencer.setPrice(110);
		
		ShoppingCart shoppingCart = (ShoppingCart) request.getSession().getAttribute("cart");
		shoppingCart.addItem(silencer, 5);
		
		for (Map.Entry<Silencer, Integer> entry: shoppingCart.cart.entrySet()) {
			double price =entry.getKey().getPrice();
			double percent = discount / 100;
			double afterDiscount = price - (percent * price);
			request.getSession().setAttribute("afterDiscount", afterDiscount);
		
		}
		
		
		  SilencerServices silencerService= new SilencerServices(request, response);
		  silencerService.pureListSilencer();
		 
		

		
		  String path = "frontend/shopping_cart.jsp"; RequestDispatcher dispatcher = request.getRequestDispatcher(path); 
		  dispatcher.forward(request,response);
		 
		
	
	}

}