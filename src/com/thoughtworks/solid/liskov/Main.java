package com.thoughtworks.solid.liskov;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Worker> workers = new ArrayList<Worker>();
        workers.add(new HumanWorker());
        workers.add(new RobotWorker());


        for (Worker worker : workers) {
            worker.eat(new Food());
            worker.work();
        }
    }
}
