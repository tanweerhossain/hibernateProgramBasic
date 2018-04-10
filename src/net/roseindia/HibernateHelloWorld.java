package net.roseindia;

//import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * @author Deepak Kumar 
 * * Web: http://www.roseindia.net
 */
public class HibernateHelloWorld {
	public static void main(String[] args) throws Exception {

		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		Transaction tr = session.beginTransaction();

		Query query = session.createQuery("from Employee");
		List lst = query.list();
		
		for(Object employee : lst){ //Iterator<Iterator> it=lst.iterator();it.hasNext();){
		
			Employee emp=(Employee)employee; //it.next();
			System.out.printf("| %10s | %15s | %15s |\n", emp.getEmpName() , emp.getEmpAddress() , emp.getEmpMobileNos());
		 }

		tr.commit();
		System.out.println("Data displayed");
		sessFact.close();
	}
}
