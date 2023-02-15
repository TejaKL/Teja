package Sample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Cool {
public static void main(String[] args) {
	EntityManagerFactory e= Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	Query q=m.createQuery("delete  from Demo  ");
List<Demo>l=q.getResultList();
for(Demo d:l)
	System.out.println(d);
	
//	 Demo d=m.find(Demo.class, 1);
//	 System.out.println(d);
	 
//	 d.setName("pooo");
//	 d.setCity("dvg");
//	 d.setPhone(9085234l);
 t.begin();
	 q.executeUpdate();
	 t.commit();
}
}
