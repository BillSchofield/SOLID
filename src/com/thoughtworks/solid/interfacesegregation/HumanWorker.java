package com.thoughtworks.solid.interfacesegregation;

public class HumanWorker implements Worker {
    @Override
    public void work() {
        System.out.println("I do good work");
    }

    @Override
    public void eat() {
        System.out.println("I eat food");
    }
}
