package com.HibernateAssignment.ManyToManyhibernate;

import java.util.ArrayList;
import java.util.List;

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
       // System.out.println( "Hello World!" );
    	
    	//Creating the configuration object
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	//Build the session factory
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	//create the Employee class object
    	Employee e=new Employee();
    	e.setEmp_id(101);
    	e.setEmp_name("Pooja");
    	
    	Employee e1=new Employee();
    	e1.setEmp_id(102);
    	e1.setEmp_name("Jayshri");
    	
    	Employee e2=new Employee();
    	e2.setEmp_id(103);
    	e2.setEmp_name("Vaishnavi");
    	
    	Project p=new Project();
    	p.setId(201);
    	p.setName("Project1");
    	
        Project p1=new Project();
        p1.setId(202);
        p1.setName("Project2");
        
        Project p2=new Project();
        p2.setId(203);
        p2.setName("Project3");
        
      //creating list of course to associate with 1 student
        List<Employee>Emp1=new ArrayList<Employee>();
    	List<Project>Proj1=new ArrayList<Project>();
    	
    	Emp1.add(e1);
    	Emp1.add(e2);
    	p1.setEmployee(Emp1);
    	
    	Proj1.add(p1);
    	Proj1.add(p2);
    	e2.setProject(Proj1);
    	
       //setting the course with the student
    	
    	Session session= factory.openSession();
    	//begin the transaction
    	Transaction tx=session.beginTransaction();
    	
    	////saving the entity object in session
    	session.save(p);
    	session.save(p1);
    	session.save(p2);
    	session.save(e);
    	session.save(e1);
    	session.save(e2);
    	
    	tx.commit();
    	session.close();
    	factory.close();
    	}
        
        
    	
    			
    	
    	
    }

