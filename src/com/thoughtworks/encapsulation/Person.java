package com.thoughtworks.encapsulation;

public class Person {
    private Integer hungerLevel;
    private Integer eatFoodThreshold;
    private Integer foodAmount;

    public Person(Integer hungerLevel, Integer eatFoodThreshold, Integer foodAmount) {
        this.hungerLevel = hungerLevel;
        this.eatFoodThreshold = eatFoodThreshold;
        this.foodAmount = foodAmount;
    }

    private void eat() {
        int amountOfFoodToEat = 10;
        if (amountOfFoodToEat > foodAmount){
            amountOfFoodToEat = foodAmount;
        }

        hungerLevel -= amountOfFoodToEat;
        foodAmount -= amountOfFoodToEat;
        System.out.println("The person got hungry and ate " + amountOfFoodToEat + " units of food.");
    }

    private boolean hasFood() {
        return foodAmount > 0;
    }

    public boolean isHungry() {
        return hungerLevel > eatFoodThreshold;
    }

    public boolean isAlive() {
        return foodAmount > 0 || hungerLevel < 100;
    }

    public void increaseHunger() {
        this.hungerLevel++;
    }

    public void eatIfFoodLeft() {
        if (hasFood()){
            eat();
        } else {
            System.out.println("The person got hungry and is out of food.");
        }

    }
}
