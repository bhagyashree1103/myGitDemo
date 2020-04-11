package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.MySQLDialect;

public class Test {
public static void main(String[] args) {
	
	Configuration cfg= new Configuration();
	cfg.configure();//to load hibernate.cfg.xml file
	SessionFactory sf=cfg.buildSessionFactory();// provide bunch of connection object
	Session session=sf.openSession();//to open connection
	Student s= new Student();
	//s.setRollno(3);
	//s.setName("abcd");
	//session.save(s);//store object in to database
//	session.beginTransaction().commit();//trasaction is commited or completed
	
	Session session1=sf.openSession();//to open connection
	Student s1=session1.get(Student.class,3);
	s1.setName("bhagyashree");
	session1.merge(s1);
	session1.saveOrUpdate(s1);
	session1.beginTransaction().commit();
	System.out.println("data inserted!!!!!!!!");
}
}
/**/
