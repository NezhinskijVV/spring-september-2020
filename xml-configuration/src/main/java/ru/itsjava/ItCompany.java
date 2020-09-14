package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItCompany {

    public static void main(String[] args) {

//        ru.itsjava.Computer computer = new ru.itsjava.Notebook();
//        ru.itsjava.Programmer programmer = new ru.itsjava.Programmer(computer);
//
//        System.out.println(programmer);

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        Computer notebook = context.getBean(Computer.class);

        System.out.println("notebook = " + notebook);
        
        Programmer programmer = context.getBean(Programmer.class);

        System.out.println("programmer = " + programmer);

        Computer notebook2 = context.getBean(Computer.class);
        System.out.println("(notebook == notebook2) = " + (notebook == notebook2));


    }
}
