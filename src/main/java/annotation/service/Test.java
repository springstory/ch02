package annotation.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private UserService userService;
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
		UserService userService = context.getBean("userService", UserService.class);
		String message = userService.getHelloMessage();
		System.out.println(message);
	}
}
