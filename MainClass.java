package annotation_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/annotation_demo/A1config.xml");
		A1 a = (A1) context.getBean("a1");
		a.disp();
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("/annotation_demo/A1config.xml");
		B1 b = (B1) context.getBean("b1");
		System.out.println(b.a);
		
	}
}
