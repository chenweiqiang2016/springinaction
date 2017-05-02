package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws PerformanceException{
		//如何创建这一文件路径
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
		//使用默认的构造器
		Performer duke = (Performer) ctx.getBean("duke");
	    duke.perform();
	    //使用带一个int参数的构造器
	    Performer newDuke = (Performer) ctx.getBean("newDuke");
	    newDuke.perform();
	    //带两个参数的构造器
	    Performer poeticDuke = (Performer) ctx.getBean("poeticDuke");
	    poeticDuke.perform();
	    //测试Bean的init-method和destroy-method
	    //Auditorium auditorium = (Auditorium) ctx.getBean("auditorium");
	    //构造器注入
	    Performer kenny = (Performer) ctx.getBean("kenny");
	    kenny.perform();
	    //使用内部bean
	    Performer pickyKenny = (Performer) ctx.getBean("pickyKenny");
	    pickyKenny.perform();
	    
	}

}
