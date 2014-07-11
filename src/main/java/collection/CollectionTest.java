package collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CollectionBean bean = context.getBean("listTest", CollectionBean.class);
		System.out.println(bean);
		
		CollectionBean setTest = context.getBean("setTest", CollectionBean.class);
		System.out.println(setTest);
		
		CollectionBean mapTest = context.getBean("mapTest", CollectionBean.class);
		System.out.println(mapTest);
		
		CollectionBean propTest = context.getBean("propTest", CollectionBean.class);
		System.out.println(propTest);
	}
}
