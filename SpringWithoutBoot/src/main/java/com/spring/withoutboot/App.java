package com.spring.withoutboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    // First, we need required Spring dependencies
    // Spring Core, Spring Context (Minimum for Spring Core functionality)
    public static void main( String[] args )
    {
        System.out.println( "Application Started ✅" );

        // We have to create object of Application Context
        ApplicationContext context = new AnnotationConfigApplicationContext();
    }
}
