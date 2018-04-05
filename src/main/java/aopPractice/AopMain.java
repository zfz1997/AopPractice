package aopPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
    public static void main(String[] args) {
    	ApplicationContext ctx = 
           new ClassPathXmlApplicationContext("aop.xml");
    	  HelloWorld hw1 = (HelloWorld)ctx.getBean("helloWorldImpl1");
    	    HelloWorld hw2 = (HelloWorld)ctx.getBean("helloWorldImpl2");
    	    hw1.printHelloWorld();
    	    System.out.println();
    	    hw1.doPrint();
    	    
    	    System.out.println();
    	    hw2.printHelloWorld();
    	    System.out.println();
    	    hw2.doPrint();

	}
}
