package com.thoughtworks.solid.interfacesegregation;

public class Main {
    public static void main(String[] args) {
        Worker bob = new HumanWorker();

        bob.work();
        bob.eat();

    }
}
