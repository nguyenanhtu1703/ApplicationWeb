package com.nguyenanhtu;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {

	public static SessionFactory sessionFactory;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hibernate one to one(XML mapping)");
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
    	        .configure() // configures settings from hibernate.cfg.xml
    	        .build();
    	try {
    	    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    	} finally {
    		System.out.println("finally");
    	}

    	//Stock stock = GetStock(16);
    	
    	//DeleteStock(stock);
	
	}
	
	public static void printData(Stock stock, int count) {
		if (stock == null)
			System.out.println("NULL");
		else System.out.println(count + " Name="+ stock.getStockName() + ", Code=" + stock.getStockCode());
	}
	
	
	public static Stock GetStock(int i) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Stock tmp = session.get(Stock.class, i);
		
		session.getTransaction().commit();
		session.close();
		
		return tmp;
	}

	public static void SaveStock(Stock a) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		session.save(a);
		
		session.getTransaction().commit();
		session.close();
	}
	
	public static void SaveStockDetail(StockDetail a) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		session.save(a);
		
		session.getTransaction().commit();
		session.close();
	}
	
	public static StockDetail GetStockDetail(int i) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		StockDetail tmp = session.get(StockDetail.class, i);
		
		session.getTransaction().commit();
		session.close();
		
		return tmp;
	}
		
	
	public static void DeleteStock(Stock a) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		session.remove(a);
		
		session.getTransaction().commit();
		session.close();
	}
	
	public static void DeleteStockDetail(StockDetail a) {
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		session.remove(a);
		
		session.getTransaction().commit();
		session.close();
	}
	
	public static void AddAStock(String a, String b) {
		Stock stock = new Stock(a, b);
		Stock stock2 = new Stock(a, b);
		
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		session.save(stock);
		
		session.getTransaction().commit();
		session.close();
	}
	
	public static void AddAStockDetail(String a, String b, String c, String d) {
		StockDetail stock = new StockDetail(a, b, c);
		stock.setStockId(8);
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		session.save(stock);
		
		session.getTransaction().commit();
		session.close();
	}

	
	public static void AddAStock(int i, String a, String b) {
		Stock stock = new Stock(a, b);
		stock.setStockId(i);
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		session.save(stock);
		
		session.getTransaction().commit();
		session.close();
	}
	
	
}