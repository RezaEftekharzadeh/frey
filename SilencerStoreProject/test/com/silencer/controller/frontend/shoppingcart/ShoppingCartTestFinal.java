package com.silencer.controller.frontend.shoppingcart;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import com.silencer.entity.Silencer;

public class ShoppingCartTestFinal {
	private static ShoppingCart cart;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		cart = new ShoppingCart();
		/*
		 * Silencer silencer = new Silencer(57);
		 * 
		 * cart.addItem(silencer, 2);
		 */
	}

	@Test
	public void testAddItem() {
		
		Map<Silencer, Integer> items = cart.getItems();
		
		Silencer silencer = new Silencer(57);
		  
		cart.addItem(silencer, 2);
		cart.addItem(silencer, 2);
		int quantity = items.get(silencer);
		
		assertEquals(4, quantity);
	}

	@Test
	public void testRemoveItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalQuantity() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalAmount() {
		fail("Not yet implemented");
	}

	@Test
	public void testClear() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalItems() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetItems() {
		fail("Not yet implemented");
	}

}
