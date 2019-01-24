package com.learn.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {

        //Load the Spring COnfiguration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ( "applicationContext.xml" );

        //Retrieve bean from Spring Container
        Coach coach = context.getBean ( "myCoach", Coach.class );

        //Call methods on the bean
        System.out.println ("***************" +coach.getMessage () +"*******************");

        //close the context
        context.close ();
    }
}
