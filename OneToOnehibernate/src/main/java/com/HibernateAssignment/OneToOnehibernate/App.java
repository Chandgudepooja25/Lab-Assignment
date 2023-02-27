package com.HibernateAssignment.OneToOnehibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //Creating the configuration object
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	//Build the session factory
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Student s=new Student();
    	s.setId(101);
    	s.setName("Pooja");
    	
    	Laptop l=new Laptop();
    	l.setId(1012);
    	l.setName("lenovo");
    	
    	s.setLaptop(l);
    	l.setStudent(s);
    	
    	Session session=factory.openSession();
    	
    	//begin the transaction
    	Transaction tx=session.beginTransaction();
    	
    	session.save(s);
    	
    	session.save(l);
    	
    	//commiting the trasaction
    	
    	tx.commit();
    	//closing the session and factory trasaction
    	session.close();
    	factory.close();
    }
}
