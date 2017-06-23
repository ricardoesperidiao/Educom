package br.edu.educom.persistence.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	
	private static SessionFactory factory;
	
	static{
		factory = new AnnotationConfiguration().configure().buildSessionFactory();
	}
	
	public static Session getSession(){
		return factory.openSession();
	}
}
