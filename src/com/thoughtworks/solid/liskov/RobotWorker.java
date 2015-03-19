package com.thoughtworks.solid.liskov;


public class RobotWorker implements Worker {

    @Override
    public void eat(Food food) {
        System.out.println("I don't know how to eat food because I'm a robot.");
    }

    @Override
    public void work() {
        System.out.println("I do LOTS of good work because I never eat or sleep");
    }
}
