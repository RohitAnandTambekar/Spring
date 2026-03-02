package org.example;

public class Person {

    private String name;
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCar() {
        return car.getColor();
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
