package com.thoughtworks.encapsulation;

public class Main {

    public static void main(String[] args) {
        Integer hungerLevel = 0;
        Integer eatFoodThreshold = 65;
        Integer foodAmount = 43;

        Person person = new Person(hungerLevel, eatFoodThreshold, foodAmount);

        while(person.isAlive()){
            if (person.isHungry()){
                person.eatIfFoodLeft();
            } else {
                System.out.println("The person is not hungry");
            }
            person.increaseHunger();
        }
        System.out.println("The person is out of food and starved.");
    }

}
