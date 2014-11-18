package com.thoughtworks.solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat());
        animals.add(new Dog(animals));

        for (Animal animal : animals) {
            System.out.println(animal.speak());
        }
    }
}
