package com.silencer.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.silencer.entity.Silencer;

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
	public List<Silencer> listTread() {
		
		return super.findWithNamedQuery("silencer.findAllTread");
		
	}
	public List<Silencer> listCore() {
		
		return super.findWithNamedQuery("silencer.findAllCore");
		
	}
	
	public boolean findByTreadAndCore(String treadSize , String coreSize) {
		
		  List<Silencer> listSilencer=
				  super.findWithNamedQuery("silencer.findMatchSilencer", "threadSize",
						  treadSize , "coreSize" , coreSize);
				  
				  if(!listSilencer.isEmpty()) {
					  
					  return true;				  
				  }
				  return false;
		
	}
	

	public Silencer findByThreadSize(String threadSize) {

		  List<Silencer> listSilencer=
				  super.findWithNamedQuery("silencer.findByThreadSize", "threadSize", threadSize);
		  
		  if(!listSilencer.isEmpty()) {
			  
			  for(int i=0; i<listSilencer.size(); i++) {
		  
		 
		  
		  return listSilencer.get(1); }
		  
		  }
		  
		  return null;
		 
		}
	
	public Silencer findBycode(String code) {

		  List<Silencer> listSilencer=
				  super.findWithNamedQuery("silencer.findByCode", "code", code);
		  
		  		if(!listSilencer.isEmpty()) {
			  
		  			for(int i=0; i<listSilencer.size(); i++) {

		  			return listSilencer.get(0);
			  }
		  
		  }
		  
		  return null;
		 
		}
		

	@Override
	public long count() {
		
		return super.countWithNamedQuery("silencer.countAll");
	}

}
