package com.silencer.entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.silencer.entity.Users;

public class UserTest {

	public static void main(String[] args) {
		
		Users user1=new Users();
		user1.setEmail("haldis22@yahoo.com");
		user1.setFullName("hali");
		user1.setPassword("hhhhhh");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SilencerStoreProject");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(user1);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("A user persisted");

	}

}
