package patients;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	
	 public static void main(String[] args) {
	      ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

	      Patient p = (Patient) context.getBean("patient");
	      p.calculate();
	      context.close();
	 }
}
