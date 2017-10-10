package org.billschofield.solid.liskov;

public class HumanWorker implements Worker {

    @Override
    public void eat(Food food) {
        food.eat();
        System.out.println("I eat food");
    }

    @Override
    public void work() {
        System.out.println("I do good work");
    }
}
