package Spring__programs.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
    AbstractApplicationContext ac=    new ClassPathXmlApplicationContext("Spring__programs/Spring1/Student.xml");
 Student st1=   (Student) ac.getBean("student1");
 System.out.println(st1);
// Student st2=   (Student) ac.getBean("student2");
// System.out.println(st2);
// ac.registerShutdownHook();
    }
}
