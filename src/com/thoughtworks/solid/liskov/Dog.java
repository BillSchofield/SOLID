package com.thoughtworks.solid.liskov;

import java.util.List;

public class Dog implements Animal {
    private List<Animal> animals;

    public Dog(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String speak() {
        animals.add(new Dog(animals));
        return "Woof";
    }
}
