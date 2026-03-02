package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Car c=new Car();
        c.setColor("purple");
        Supplier<Car> carSupplier=()->c;
        context.registerBean("car",Car.class,carSupplier);
        Car carbean=context.getBean("car",Car.class);
        System.out.println(carbean.getColor());
    }
}