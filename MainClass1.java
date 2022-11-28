package annotation_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass1 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		A1 a = (A1) context.getBean("a1");
		a.disp();
		ApplicationContext context1 = new AnnotationConfigApplicationContext(ConfigClass.class);
		B1 b = (B1) context1.getBean("b1");
		System.out.println(b.a);
	}
}
