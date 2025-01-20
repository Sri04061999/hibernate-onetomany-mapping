package mapping.demo;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mapping");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Bank b1=new Bank();
		b1.setBankName("HDFC");
		b1.setBankNumber(454545);
		Bank b2=new Bank();
		b2.setBankName("kotak mahindra bank");
		b2.setBankNumber(7777777);
		//-----------------------------
		Person p1=new Person();
		p1.setAge(45);
		p1.setPersonName("ramesh");
//		ArrayList<Bank> al=new ArrayList<Bank>();
//		al.add(b1);
//		al.add(b2);
//		al.add(b4);
//		p1.setBank(al);  or
		p1.setBank(Arrays.asList(b1,b2));
		transaction.begin();
		manager.persist(p1);
		transaction.commit();
	}
}
