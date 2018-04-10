package net.roseindia.model;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
////import javax.persistence.ParameterMode;
//import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.roseindia.HibernateUtil;
//import javax.persistence.StoredProcedureQuery;
//import org.hibernate.jpa.HibernatePersistenceProvider;
		/*
		//Compile mvn compile
		//Run: mvn exec:java -Dexec.mainClass="net.roseindia.AppTest"
		
		*/
/**
* @author Deepak Kumar
* More tutorials at http://www.roseindia.net
*/
		
public class AppTest {

//	private static final String PERSISTENCE_UNIT_NAME = "psunit1";
//	private static EntityManagerFactory factory;

	public static void main(String[] args) throws Exception {
//		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.openSession();
//		EntityManager em = factory.createEntityManager();

//		em.getTransaction().begin();
		
		Product product = new Product();
		product.setProductName("JPA 2.1 Book");
		product.setProductDescription("This is the latest book on JPA 2.1");
		product.setStockQty(100.00);
		product.setPrice(95.99);
		
		
		session.save(product);
		session.beginTransaction().commit();
		session.close();
		
	}
}