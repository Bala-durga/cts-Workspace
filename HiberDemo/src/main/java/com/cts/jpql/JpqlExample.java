package com.cts.jpql;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.cts.util.JPAutil;
public class JpqlExample {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManager em=JPAutil.getEntityManagerFactory().createEntityManager();
		Emp emp=em.find(Emp.class,101);
		if(emp!=null) {
			System.out.println(emp);
		}
		String querystring="SELECT e from Emp e";
		Query qry=em.createQuery(querystring);
		display(qry.getResultList());
//		display(em.createQuery("SELECT e from Employee e where e.basic>25000").getResultList());
		List<String> names=em.createQuery("SELECT e.ename from EMPLOYEE e").getResultList();
		for(String n:names) {
			System.out.println(n);
		}
		em.close();
		JPAutil.shutdown();
	}
	static void display(List<Employee> data) {
		System.out.println("............");
		for(Employee e:data) {
			System.out.println(e);
		}
		System.out.println("............");
		

	}

}
