package com.HibernateAssignment.OneToManyhibernate;

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
        //System.out.println( "Hello World!" );
    	//Creating the configuration object
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	//Build the session factory
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	//Create the Department class object
    	Department d=new Department();
    	d.setDept_id(111);
    	d.setDept_name("Assistant manager");
    	
    	//create the Employee class object
    	Employee e=new Employee();
    	e.setEmp_id(201);
    	e.setEmp_name("Pooja");
    	e.setDepartment(d);//setting the employee for employee object
    	
    	Employee e1=new Employee();
    	e1.setEmp_id(202);
    	e1.setEmp_name("Jayshri");
    	e1.setDepartment(d);
    	
    	Employee e2=new Employee();
    	e2.setEmp_id(203);
    	e2.setEmp_name("Vaishnavi");
    	e2.setDepartment(d);
    	
    	//creating the list of Employee to associated with one department
    	List<Employee>list=new ArrayList<Employee>();
    	list.add(e);
    	list.add(e1);
    	list.add(e2);
    	
    	//Setting the employee with the department
    	d.setEmployee(list);
    	
    	//open the session by using factory
    	Session session=factory.openSession();
    	
    	//begin the Transaction
    	Transaction tx=session.beginTransaction();
    	
    	//saving the entity object in session
    	session.save(d);
    	session.save(e);
    	session.save(e1);
    	session.save(e2);
    	
    	//commiting the transaction
    	tx.commit();
    	
    	//closing the session and factory transaction
    	session.close();
    	factory.close();
    	
    	
    }
}
