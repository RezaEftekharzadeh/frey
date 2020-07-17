package com.silencer.dao;



import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.silencer.entity.Users;

public class UserDAOTest {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static UserDAO userDao;
	
	@BeforeClass
	public static void setup() {
		
		 entityManagerFactory = Persistence.createEntityManagerFactory("SilencerStoreProject");
		 entityManager=entityManagerFactory.createEntityManager();
		
		 userDao=new UserDAO(entityManager);
	}
	

	@Test
	public void testCreateUsers() {
		
		Users user1=new Users();
		user1.setEmail("Sh333@yahoo.com");
		user1.setFullName("somigg");
		user1.setPassword("ezzigg");
	
		user1= userDao.create(user1);
		
		assertTrue(user1.getUserId()>0);
	}
	
	
	@Test(expected = PersistenceException.class)
	public void testCreateUserNotNull() {
		
		Users user1=new Users();
		
		user1= userDao.create(user1);
	}
	
	@Test
	public void testUpdateUser() {
		
		Users user=new Users();
		
		user.setEmail("test1@gmail.com");
		user.setFullName("eric.eft");
		user.setPassword("12345");
		user.setUserId(4);
		
		user= userDao.update(user);
	}
	
	
	@Test
	public void testGetUsersFound() {
		Integer userId=4;
		Users user=userDao.get(userId);
		System.out.println(user.getEmail());
		assertNotNull(user);
	}
	
	@Test
	public void testGetUsesNotNull() {
		Integer userId=99;
		Users user=userDao.get(userId);
		
		assertNull(user);
	}
	
	@Test
	public void testDeleteUser() {
		Integer userId=4;
		userDao.delete(userId);
		
		Users user=userDao.get(userId);
		
		assertNull(user);
	}
	
	@Test(expected =EntityNotFoundException.class )
	public void testDeleteNoneExistUser() {
		Integer userId=21;
		userDao.delete(userId);
		
	}
	
	@Test
	public void testFindAll() {
		List<Users> listUsers= userDao.listAll();
		
		for(Users user:listUsers) {
			System.out.println(user);
		}
		assert(listUsers.size()>0);
	}
	
	@AfterClass
	public static void tearDown() {
		entityManager.close();
		entityManagerFactory.close();
	}


}