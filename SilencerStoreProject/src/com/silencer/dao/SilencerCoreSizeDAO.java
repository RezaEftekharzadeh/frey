package com.silencer.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.silencer.entity.SilencerCoreSize;
import com.silencer.entity.SilencerTreadSize;

public class SilencerCoreSizeDAO extends JpaDAO<SilencerCoreSize> implements GenericDAO<SilencerCoreSize> {

	public SilencerCoreSizeDAO(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public SilencerCoreSize create(SilencerCoreSize silencerSize) {
		
		return super.create(silencerSize);
	}

	@Override
	public SilencerCoreSize get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SilencerCoreSize> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
