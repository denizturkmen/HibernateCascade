package com.denizturkmen.Client;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.denizturkmen.Entity.Employee;
import com.denizturkmen.Util.HibernateUtil;

public class DeleteClient {

	public static void main(String[] args) {
		deleteEmployeeById();
	}

	private static void deleteEmployeeById() {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			
			Employee employee = session.get(Employee.class, 1);
			if(employee != null) {
				session.beginTransaction();
				session.delete(employee);
				session.getTransaction().commit();
			}
			else {
				System.out.println("Bulanamadi");
			}
		}
		catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}
}
