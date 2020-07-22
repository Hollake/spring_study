package com.how2java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.pojo.Category;

public class TestSpring {

	public static void main(String[] args) {
        String path =  "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(path);
        Category c = (Category) context.getBean("c");
		c.setId(12);
		System.out.println(c.getName()+c.getId());

	}
}