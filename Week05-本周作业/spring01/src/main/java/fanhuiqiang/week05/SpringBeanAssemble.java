package fanhuiqiang.week05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fanhuiqiang.week05.bean.Car;
import fanhuiqiang.week05.bean.Lawyer;
import fanhuiqiang.week05.bean.Teacher;



public class SpringBeanAssemble {
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextMy.xml");
		 //第一种装配方式：xml中配置bean 
		 Car car = (Car) context.getBean("car123");
		 System.out.println(car.toString());
		 //第二种装配方式：组件扫描和自动装配
		  Teacher teacher = (Teacher) context.getBean(Teacher.class);
	      System.out.println(teacher.toString());
	      //第三种装配方式：通过Java代码装配Bean
	      Lawyer lawyer = (Lawyer) context.getBean(Lawyer.class);
	      System.out.println(lawyer.toString());
	}
}
