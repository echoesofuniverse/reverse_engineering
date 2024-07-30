package echoes.codejava.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder; 

public class StudentTest {
	
 public static void main(String[] args) {
	 SessionFactory sessionFactory = null;
	 final StandardServiceRegistry registry = (StandardServiceRegistry) ((Object) new 
	  StandardServiceRegistryBuilder()
	 .configure()); // configures settings from hibernate.cfg.xml
	 System.out.println("A new Student has been saved");

		try {

		    sessionFactory = new MetadataSources().buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
		    StandardServiceRegistryBuilder.destroy(registry);
		}
		Session session = sessionFactory.openSession();
		 session.beginTransaction();
		 
		 Student student=new Student();
		 student.setEmail("sjhs@gmail.com");
		 student.setStudentFullName("Sri");
		 session.save(student);
		 session.getTransaction().commit();
		 session.close();
		 sessionFactory.close();
		 System.out.println("A new Student has been saved");
 }
 }
