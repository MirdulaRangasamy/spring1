package com.mirdu.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mirdu.spring1.component.Driver;
import com.mirdu.spring1.configuration.AutoConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
    	Driver d = context.getBean(Driver.class);
    	//d.setV(context.getBean(Vehicle.class));
    	d.getV().drive();
    }
}
