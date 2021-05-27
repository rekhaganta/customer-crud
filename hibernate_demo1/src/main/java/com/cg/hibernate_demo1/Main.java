package com.cg.hibernate_demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class Main 
{
    public static void main( String[] args )
    {
    	// using hibernate/jpa api - we will persist the employee object in emp table
        // Step 1: loading the hibernate configuration file
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();


        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();


        // Step 2: obtaining SessionFactory object
        SessionFactory factory = meta.getSessionFactoryBuilder().build();


        Session session = factory.openSession();


        Transaction t = session.beginTransaction();


        Employee employee = new Employee();
        employee.setId(200);
        employee.setName("vijay");
        employee.setEmail("vijay@cg.com");
        
        Employee employee1 = new Employee();
        employee1.setId(112);
        employee1.setName("rekha");
        employee1.setEmail("rekha123@.com");



        session.save(employee);
        
        session.save(employee1);

        t.commit();


        System.out.println("employee object saved!!");
        
    }
}
