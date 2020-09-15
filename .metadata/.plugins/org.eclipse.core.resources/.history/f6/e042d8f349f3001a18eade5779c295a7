package com.silencer.controller.frontend.shoppingcart;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.silencer.entity.Silencer;


@WebServlet("/cart_remove")
public class RemoveFromCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RemoveFromCartServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer silencerId= Integer.parseInt(request.getParameter("silencer_id"));
		Object cartObject = request.getSession().getAttribute("cart");
		ShoppingCart shoppingCart = (ShoppingCart) cartObject;
		shoppingCart.removeItem(new Silencer(silencerId));
		String cartPage = request.getContextPath().concat("/view_cart");
		response.sendRedirect(cartPage);
	}

}
