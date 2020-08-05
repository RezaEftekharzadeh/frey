package com.silencer.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.silencer.entity.Silencer;
import com.silencer.entity.SilencerSize;
import com.silencer.entity.Users;


public class SilencerDAO extends JpaDAO<SilencerSize> implements GenericDAO<SilencerSize> {

	public SilencerDAO(EntityManager entityManager) {
		super(entityManager);
		
	}
	
	@Override
	public SilencerSize create(SilencerSize silencer) {
		return super.create(silencer);
	}
	
	@Override
	public SilencerSize update(SilencerSize silencer) {
		return super.update(silencer);
	}

	@Override
	public SilencerSize get(Object silencerId) {
		return null;
		
		//return super.find(Silencer.class, silencerId);
	}

	@Override
	public void delete(Object silencerId) {
		//super.delete(Silencer.class, silencerId);
		
		
	}

	@Override
	public List<SilencerSize> listAll() {
		
		//return super.findWithNamedQuery("silencer.findAll");
		return null;
	}
	

	public Silencer findByThreadSize(String threadSize) {
		return null;
		
		/*
		 * List<Silencer> listSilencer=
		 * super.findWithNamedQuery("silencer.findByThreadSize", "threadSize",
		 * threadSize);
		 * 
		 * if(!listSilencer.isEmpty()) { for(int i=0; i<listSilencer.size(); i++) {
		 * 
		 * System.out.println(listSilencer.get(i)); // return listSilencer.get(i);
		 * 
		 * return listSilencer.get(1); }
		 * 
		 * }
		 * 
		 * return null;
		 */
		}
		

	@Override
	public long count() {
		
		return super.countWithNamedQuery("silencer.countAll");
	}

}
