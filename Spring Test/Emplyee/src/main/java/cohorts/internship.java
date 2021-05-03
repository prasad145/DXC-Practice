package cohorts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class internship {

	public static void main(String[] args) { 
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        Cohorts s=(Cohorts)context.getBean("cohorts");  
        s.show(); 
        dxc d=(dxc)context.getBean("dxc");  
        d.show1(); 
	}

}