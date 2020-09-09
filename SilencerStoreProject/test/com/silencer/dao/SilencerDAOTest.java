package com.silencer.dao;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.silencer.entity.Silencer;

public class SilencerDAOTest {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static SilencerDAO silencerDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		entityManagerFactory = Persistence.createEntityManagerFactory("SilencerStoreProject");
		entityManager = entityManagerFactory.createEntityManager();

		silencerDao = new SilencerDAO();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		entityManager.close();
		entityManagerFactory.close();
	}

	@Test
	public void testCreateSilencer() throws IOException {
		Silencer silencer = new Silencer();
		silencer.setCoreSize("18x1");
		silencer.setPrice(120);
		silencer.setThreadSize("featherlight 196");
		silencer.setDescription("very light ");

		String imagePath = "C:\\CV\\java.jpg";
		byte[] image = Files.readAllBytes(Paths.get(imagePath));

		silencer.setImage(image);

		silencerDao.create(silencer);
	}

	@Test
	public void testUpdateSilencer() throws IOException {
		Silencer silencer = new Silencer();
		
		  silencer.setSilencerId(4); 
		  silencer.setCoreSize("22x1");
		  silencer.setPrice(120); 
		  silencer.setThreadSize("featherlight 196");
		  silencer.setDescription("very light "); 
		  silencer.setSilencerId(2);
		  
		  String imagePath= "C:\\CV\\java.jpg" ; // byte[] image=
		  byte[] image=  Files.readAllBytes(Paths.get(imagePath));
		  
		  silencer.setImage(image);
		 

		silencerDao.update(silencer);
	}
	
	@Test
	public void testDeleteSilencer() {
		int id= 20;
		silencerDao.delete(id);
	}
	
	@Test
	public void testGetSilencer() {
		int id =3;
		Silencer silencer= silencerDao.get(id);
		System.out.println(silencer.getCoreSize());
	}
	
	@Test
	public void testFindAllSilencer(){
		List<Silencer> silencer = silencerDao.listAll();
		for(Silencer s: silencer) {
			System.out.println(s.getCoreSize());
		}
		
	}
	@Test
	public void testFindByTheadSize() {
		Silencer silencer = silencerDao.findByThreadSize("featherlight 196");
		
	
		System.out.println(silencer.getCoreSize());
		
	}
	
	@Test
	public void testAllTreadSize() {
		List<Silencer> listSilencer= silencerDao.findWithNamedQuery("silencer.findByCoreSize", "coreSize", "18x1");
		
		if(!listSilencer.isEmpty()) { 
			for(int i=0; i<listSilencer.size(); i++) {
				
				  Silencer silencer =listSilencer.get(i);
				  System.out.println(silencer.getThreadSize());
				
			}
		}
	

	}
	@Test
	public void testCountAllSilencer() {
		long count = silencerDao.count();
		
		assertEquals(5, count);
	}
}

















