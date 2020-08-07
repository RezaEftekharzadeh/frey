package com.silencer.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.silencer.entity.Silencer;
import com.silencer.entity.SilencerTreadSize;
import com.silencer.entity.Users;


public class SilencerDAO extends JpaDAO<Silencer> implements GenericDAO<Silencer> {

	public SilencerDAO(EntityManager entityManager) {
		super(entityManager);
		
	}
	
	@Override
	public Silencer create(Silencer silencer) {
		return super.create(silencer);
	}
	
	@Override
	public Silencer update(Silencer silencer) {
		return super.update(silencer);
	}

	@Override
	public Silencer get(Object silencerId) {
		
		
		return super.find(Silencer.class, silencerId);
	}

	@Override
	public void delete(Object silencerId) {
		super.delete(Silencer.class, silencerId);
		
		
	}

	@Override
	public List<Silencer> listAll() {
		
		return super.findWithNamedQuery("silencer.findAll");
		
	}
	

	public Silencer findByThreadSize(String threadSize) {
		
		
		
		  List<Silencer> listSilencer=
		  super.findWithNamedQuery("silencer.findByThreadSize", "threadSize",
		  threadSize);
		  
		  if(!listSilencer.isEmpty()) { for(int i=0; i<listSilencer.size(); i++) {
		  
		  System.out.println(listSilencer.get(i)); // return listSilencer.get(i);
		  
		  return listSilencer.get(1); }
		  
		  }
		  
		  return null;
		 
		}
		

	@Override
	public long count() {
		
		return super.countWithNamedQuery("silencer.countAll");
	}

}
