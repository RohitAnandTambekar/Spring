package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p=context.getBean(Person.class);
        Car c=context.getBean(Car.class);

        System.out.println(p.getName());
        System.out.println(p.getCar());
        System.out.println(c);
        System.out.println(c.getColor());
    }
}