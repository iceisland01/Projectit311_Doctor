package utility;
import java.util.Properties;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import model.Opd_Card;
import model.Patient;
import model.Payments;
import model.Queue;
import model.TypeUser;
import model.User;
import model.UserOpdcard;
import model.UserOpdcardID;
import model.UserPatient;
import model.UserPatientID;
import model.Login;




public class HibernateConnection {
	static String url = "jdbc:mysql://localhost:3306/web?characterEncoding=UTF-8";
	static String uname = "root";
	static String pwd = "1234";
	
	public static SessionFactory sessionFactory;
	
	public static SessionFactory doHibernateConnection() {
	Properties database = new Properties();
	database.setProperty("hibernate.hbm2ddl.auto","create");
	database.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
	database.setProperty("hibernate.connection.username", uname);
	database.setProperty("hibernate.connection.password", pwd);
	database.setProperty("hibernate.connection.url", url);
	database.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
	Configuration cfg = new Configuration().setProperties(database).addPackage("model")
			//.addAnnotatedClass(Employee.class)
			.addAnnotatedClass(Login.class)
			.addAnnotatedClass(TypeUser.class)
			.addAnnotatedClass(Opd_Card.class)
			.addAnnotatedClass(Patient.class)
			.addAnnotatedClass(Payments.class)
			.addAnnotatedClass(Queue.class)
			.addAnnotatedClass(User.class)
		    .addAnnotatedClass(UserPatient.class)
			.addAnnotatedClass(UserPatientID.class)
			.addAnnotatedClass(UserOpdcard.class)
			.addAnnotatedClass(UserOpdcardID.class)
			
			
			;
	
	StandardServiceRegistryBuilder ssrb =
	new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
	sessionFactory = cfg.buildSessionFactory(ssrb.build());
	return sessionFactory;
	}

}
