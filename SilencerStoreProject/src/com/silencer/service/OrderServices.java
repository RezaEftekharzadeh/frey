package com.silencer.service;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.silencer.controller.frontend.shoppingcart.ShoppingCart;
import com.silencer.dao.OrderDAO;
import com.silencer.entity.Customer;
import com.silencer.entity.OrderDetail;
import com.silencer.entity.Silencer;
import com.silencer.entity.SilencerOrder;

public class OrderServices {
	private OrderDAO orderDAO;
	private HttpServletRequest request;
	private HttpServletResponse response;
	public OrderServices(HttpServletRequest request, HttpServletResponse response) {
		
		this.request = request;
		this.response = response;
		this.orderDAO = new OrderDAO();
	}
	
	public void listAllOrder() throws ServletException, IOException {
		
		List<SilencerOrder> listOrder = orderDAO.listAll();
		request.setAttribute("listOrder", listOrder);
		
		String listPage = "order_list.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(listPage);
		dispatcher.forward(request, response);
		
		
	}

	public void viewOrderDetailForAdmin() throws ServletException, IOException {
		int orderId = Integer.parseInt(request.getParameter("id"));
		
		SilencerOrder order= orderDAO.get(orderId);
		request.setAttribute("order", order);
		
		String detailPage = "order_detail.jsp";
		RequestDispatcher dispathcer = request.getRequestDispatcher(detailPage);
		dispathcer.forward(request, response);
		
		
	}


	public void showCheckOutForm() throws ServletException, IOException {
		
		String checkOutPage = "frontend/checkout.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(checkOutPage);
		dispatcher.forward(request,response);
		
	}

	public void placeOrder() throws ServletException, IOException {
		String recipientName = request.getParameter("recipientName");
		String recipientPhone = request.getParameter("recipientPhone");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String zipcode = request.getParameter("zipCode");
		String country = request.getParameter("country");
		
		
		SilencerOrder order = new SilencerOrder();
		order.setRicipientName(recipientName);
		order.setRicipientPhone(recipientPhone);
		String shippingAddress= address +", "+city +", "+zipcode+", "+country;
		order.setShippingAddress(shippingAddress);
		
		HttpSession session = request.getSession();
		Customer customer =(Customer) session.getAttribute("loggedInCustomer");
		
		order.setCustomer(customer);
		
		
		ShoppingCart shoppingCart = (ShoppingCart) session.getAttribute("cart");
		Map<Silencer, Integer> items = shoppingCart.getItems();
		
		Iterator<Silencer> iterator = items.keySet().iterator();
		
		Set<OrderDetail> orderDetails = new HashSet<>();
		
		while (iterator.hasNext()) {
			Silencer silencer = iterator.next();
			Integer quantity = items.get(silencer);
			float subtotal = quantity * silencer.getPrice();
			
			OrderDetail orderDetail = new OrderDetail();
			orderDetail.setSilencer(silencer);
			orderDetail.setSilencerOrder(order);
			orderDetail.setQuantity(quantity);
			orderDetail.setSubtotal(subtotal);
			
			orderDetails.add(orderDetail);
		}
		
		order.setOrderDetails(orderDetails);
		order.setTotal(shoppingCart.getTotalAmount());
		
		orderDAO.create(order);
		
		String message = "Thank you. Your order has been received.";
		request.setAttribute("message", message);
		
		String messagePage = "frontend/message.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(messagePage);
		dispatcher.forward(request, response);
	}




}




































