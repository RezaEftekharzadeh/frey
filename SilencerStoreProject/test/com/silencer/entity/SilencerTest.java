package com.silencer.entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.silencer.entity.Users;

public class SilencerTest {

	public static void main(String[] args) {
		
		 Silencer silencer = new Silencer();
		 silencer.setCoreSize("15X1");
		 silencer.setDescription("very nice");
		 silencer.setPrice(12.2f);
		 silencer.setThreadSize("featherlight 196");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SilencerStoreProject");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(silencer);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("A user persisted");

	}

}
