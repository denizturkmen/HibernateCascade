package com.denizturkmen.Client;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.denizturkmen.Entity.Adress;
import com.denizturkmen.Entity.Employee;
import com.denizturkmen.Util.HibernateUtil;

public class SaveClientTest {

	public static void main(String[] args) {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
	    	session.beginTransaction();
	    	
	    	Employee employee1= new Employee();
			employee1.setEmployeeName("Deniz Türkmen");
			employee1.setEmail("turkmen@gmail.com");
			employee1.setSalary(50000.00);
			employee1.setDoj(new Date());
			
			
			Adress address1 = new Adress();
			address1.setCity("Ankara");
			address1.setPincode(4324L);
			address1.setState("Ümitköy");
			address1.setStreet("Park Caddesi");
			
			
			employee1.setAdress(address1);
			session.persist(employee1);
			
			session.getTransaction().commit();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	  }
}
