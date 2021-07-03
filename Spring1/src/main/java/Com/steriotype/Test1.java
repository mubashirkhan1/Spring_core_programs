package Com.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
	ApplicationContext ac=new	ClassPathXmlApplicationContext("Com/steriotype/Steriotype.xml");
	Emplye emp=	ac.getBean("emplye" ,Emplye.class);
	System.out.println(emp);
	System.out.println(emp.getAdd().getClass());
	System.out.println(emp.getAdd().getClass().getName());
	System.out.println(emp.hashCode());
	
	System.out.println("--------------------------------");
	Emplye emp1=	ac.getBean("emplye" ,Emplye.class);
	System.out.println(emp1);
	System.out.println(emp1.hashCode());

	}

}
