package mapping.demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mapping");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
//		Bank b1=new Bank();
//		b1.setBankName("HDFC");
//		b1.setBankNumber(454545);
//		Bank b2=new Bank();
//		b2.setBankName("kotak mahindra bank");
//		b2.setBankNumber(7777777);
//		//-----------------------------
//		Person p1=new Person();
//		p1.setAge(45);
//		p1.setPersonName("ramesh");
////		ArrayList<Bank> al=new ArrayList<Bank>();
////		al.add(b1);
////		al.add(b2);
////		al.add(b4);
////		p1.setBank(al);  or
//		p1.setBank(Arrays.asList(b1,b2));
//		transaction.begin();
//		manager.persist(p1);
//		transaction.commit();
//-----------------------fetching Person object---------------------
//		Person person = manager.find(Person.class, "umesh");
//		System.out.println(person.getAge());
//		System.out.println(person.getPersonName());
//		List<Bank> bank = person.getBank();
//		Iterator<Bank> i = bank.iterator();
//		while(i.hasNext())
//		{
//			Bank b = i.next();
//			System.out.println(b.getBankName());
//			System.out.println(b.getBankNumber());
//		}  
//          or
		// System.out.println(person);
//--------------------fetching bank object-------------------
//		Bank bank = manager.find(Bank.class, "canara");
//		System.out.println(bank);
//----------------updating person object-----------------
//		Person person = manager.find(Person.class, "umesh");
//		person.setAge(78);
//		transaction.begin();
//		manager.merge(person);
//		transaction.commit();
//----------------updating Bank object-----------------
//		Bank bank = manager.find(Bank.class, "canara");
//		bank.setBankNumber(77777777);
//		transaction.begin();
//		manager.merge(bank);
//		transaction.commit();
//----------------deleting person object-----------------
//		Person person = manager.find(Person.class, "umesh");
//		transaction.begin();
//		manager.remove(person);
//		transaction.commit();
//--------------------deleting bank object-------------------
//		Person person = manager.find(Person.class, "ramesh");
//		List<Bank> b = person.getBank();
//		Iterator<Bank> i = b.iterator();
//		while (i.hasNext()) {
//			Bank a = i.next();
//			if(a.getBankName().equals("HDFC"))
//			{
//				i.remove();
//			}
//		}
//		person.setBank(b);
//		transaction.begin();
//		manager.merge(person);
//		transaction.commit();
//		Bank bank = manager.find(Bank.class, "HDFC");
//		transaction.begin();
//		manager.remove(bank);
//		transaction.commit();
	}
}
