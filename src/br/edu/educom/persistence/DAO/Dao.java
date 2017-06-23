package br.edu.educom.persistence.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class Dao {

	private static Dao instance;
	private Session sessao;
	private Transaction tx;
	
	private Dao(){
		
	}
	
	public static Dao getInstance(){
		if(instance==null)
			instance = new Dao();		
		return instance;
	}
		
	public <T> boolean save(T object){
		
		try{
			sessao = HibernateUtil.getSession();
			tx = sessao.beginTransaction();
			sessao.save(object);
			tx.commit();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sessao.close();
		}
	}
	
	public <T> boolean update(T object){
		try{
			sessao = HibernateUtil.getSession();
			tx = sessao.beginTransaction();
			sessao.update(object);
			tx.commit();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sessao.close();
		}
	}
	
	public <T> boolean delete(T object){
		try{
			sessao = HibernateUtil.getSession();
			tx = sessao.beginTransaction();
			sessao.delete(object);
			tx.commit();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}finally{
			sessao.close();
		}
	}
	
	public List<?> list(Class<?> classe){
		try{
			sessao = HibernateUtil.getSession();
			tx = sessao.beginTransaction();
			Criteria criteria = sessao.createCriteria(classe);
			tx.commit();
			return criteria.list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			sessao.close();
		}
	}
	
	public List<?> createQuery(String query){
		try{
			sessao = HibernateUtil.getSession();
			tx = sessao.beginTransaction();
			Query select = sessao.createQuery(query);
			tx.commit();
			return select.list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		} finally{
			sessao.close();
		}
	}
	
}
