package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");

        // Retrieve the bean using the correct ID
        Employeedetails emp1 = (Employeedetails) context.getBean("emp1", Employeedetails.class);

        // Access and print bean properties
        System.out.println("Name: " + emp1.getName());
        System.out.println("Phones: " + emp1.getPhones());
        System.out.println("Address: " + emp1.getAddress());
        System.out.println("Courses: " + emp1.getCources());

        System.out.println("Hello World!");
    }
}
