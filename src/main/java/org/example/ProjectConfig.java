package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Person person(Car c){
        Person p=new Person();
        p.setName("rohit");
        p.setCar(c);
        return p;
    }

    @Bean
    public Car car(){
        Car c=new Car();
        c.setColor("green");
        return c;
    }
}
