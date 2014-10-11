package com.test.sample;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPATest {

	private static final String PERSISTENCE_UNIT_NAME="BUSINESSUSER";
	private static EntityManagerFactory entityManagerFactory;

	
//	@PersistenceContext(unitName="BUSINESSUSER")
//	protected static EntityManager em ;
	
	public static void main(String[] args) {
		entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = entityManagerFactory.createEntityManager();
		em.getTransaction().begin();
		
		//read the existing entries and print them out
		Query q = em.createQuery("Select BU from BusinessUser BU");
		List<BusinessUser> buserList = q.getResultList();
		for(BusinessUser buser:buserList){
			System.out.println("This is the userName -->"+buser.getName());
		}
		System.out.println("Total list size"+buserList.size());
		
		//Create a couple new BusinessUsers
		
//		em.getTransaction().begin();
		BusinessUser buser = new BusinessUser();
		BusinessUser buser1 = new BusinessUser();
		BusinessUser buser2 = new BusinessUser();
		buser.setName("User1");
		buser.setCompany("Google");
		buser.setBusinessType("Search engine");
		
		buser1.setName("User2");
		buser1.setCompany("Facebook");
		buser1.setBusinessType("Social Media");
		
		buser2.setName("User3");
		buser2.setCompany("Amazon");
		buser2.setBusinessType("Sales");
		
		em.persist(buser);
		em.persist(buser1);
		em.persist(buser2);
		
		em.getTransaction().commit();
		em.close();
		
	}
	
	
}
