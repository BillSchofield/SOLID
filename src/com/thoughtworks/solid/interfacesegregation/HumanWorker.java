package com.thoughtworks.solid.interfacesegregation;

public class HumanWorker implements Worker, Eater {
    @Override
    public void work() {
        System.out.println("I do good work");
    }

    @Override
    public void eat(Food food) {
        food.eat();
        System.out.println("I eat food");

    }
}
