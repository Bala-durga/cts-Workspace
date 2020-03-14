package cts.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;



public class Emp {
	
	   /* Get the class name to be printed on */  
	   static Logger log = Logger.getLogger(Emp.class.getName());  

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("cts");
				EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Employee e=new Employee();
		log.info("employee Detail");
		e.setEname("Leo");
		em.persist(e);
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("inserted");

	}



}
