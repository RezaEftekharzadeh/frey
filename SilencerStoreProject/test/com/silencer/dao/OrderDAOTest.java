package com.silencer.dao;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.silencer.entity.Customer;
import com.silencer.entity.OrderDetail;
import com.silencer.entity.Silencer;
import com.silencer.entity.SilencerOrder;

public class OrderDAOTest {
	private static OrderDAO orderDAO;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		orderDAO = new OrderDAO();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		orderDAO.close();
	}

	@Test
	public void testCreateSilencerOrder() {
		SilencerOrder order = new SilencerOrder();
		Customer customer = new Customer();
		customer.setCustomerId(30);
		
		order.setCustomer(customer);
		
		Set<OrderDetail> orderDetails = new HashSet<>();
		OrderDetail orderDetail = new OrderDetail();
		
		Silencer silencer = new Silencer(59);
		orderDetail.setSilencer(silencer);
		orderDetail.setQuantity(2);
		orderDetail.setSubtotal(60f);
		orderDetail.setSilencerOrder(order);
		
		orderDetails.add(orderDetail);
		
		order.setOrderDetails(orderDetails);
		
		orderDAO.create(order);
		
		assertTrue(order.getOrderId() > 0);
	}

}
