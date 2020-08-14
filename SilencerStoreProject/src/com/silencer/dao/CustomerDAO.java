package com.silencer.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.silencer.entity.Customer;
import com.silencer.entity.Users;

public class CustomerDAO extends JpaDAO<Customer> implements GenericDAO<Customer> {
	
	public CustomerDAO(EntityManager entityManager) {
		super(entityManager);
		
	}

	@Override
	public Customer create(Customer customer) {
		return super.create(customer);
	}

	@Override
	public Customer get(Object customerId) {
		
		return super.find(Customer.class, customerId);
	}

	@Override
	public void delete(Object customerId) {
		super.delete(Customer.class, customerId);
		
	}

	@Override
	public List<Customer> listAll() {
		
		return super.findWithNamedQuery("Customer.findAll");
	}

	@Override
	public long count() {
		
		return 0;
	}
	public Customer findByEmail(String email) {
		
		List<Customer> listCustomers= super.findWithNamedQuery("Customer.findByEmail", "email", email);
		
		if(listCustomers !=null && listCustomers.size() > 0) {
			return listCustomers.get(0);
			
		}
		return null;
	}

}
