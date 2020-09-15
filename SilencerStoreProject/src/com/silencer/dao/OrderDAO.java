package com.silencer.dao;

import java.util.Date;
import java.util.List;

import com.silencer.entity.SilencerOrder;

public class OrderDAO extends JpaDAO<SilencerOrder> implements GenericDAO<SilencerOrder> {

	@Override
	public SilencerOrder create(SilencerOrder order) {
		order.setOrderDate(new Date());
		return super.create(order);
	}

	@Override
	public SilencerOrder update(SilencerOrder order) {
		
		return super.update(order);
	}

	@Override
	public SilencerOrder get(Object orderId) {
		
		return super.find(SilencerOrder.class, orderId);
	}

	@Override
	public void delete(Object orderId) {
		super.delete(SilencerOrder.class, orderId);
		
		
	}

	@Override
	public List<SilencerOrder> listAll() {
		return super.findWithNamedQuery("SilencerOrder.findAll");
	}

	@Override
	public long count() {
		
		return super.countWithNamedQuery("SilencerOrder.countAll");
	}

}
