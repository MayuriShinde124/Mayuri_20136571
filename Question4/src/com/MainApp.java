package com;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
       ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       Employee e=(Employee) context.getBean("emp");
       System.out.println("==========================================");
       
       System.out.println("Employee ID :"+e.getEmpid());
       System.out.println("Employee Name : "+e.getEmpname());
       
      
       System.out.println("PROGRAMING LANGUAGE : ");
       ArrayList <String>s=e.getLanguage();
       for(String l:s)
       {
    	  System.out.println("            "+l); 
       }
       System.out.println("==========================================");
       
       
	}

}
