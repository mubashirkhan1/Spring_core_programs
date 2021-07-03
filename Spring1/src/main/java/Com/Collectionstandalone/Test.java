package Com.Collectionstandalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("hii");
		ApplicationContext ac=new ClassPathXmlApplicationContext("Com/Collectionstandalone/Standalone.xml");
		
		
		Persone pr=(Persone)ac.getBean("persone1");
		System.out.println(pr);
	}

}
