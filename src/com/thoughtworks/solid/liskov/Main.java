package com.thoughtworks.solid.liskov;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Worker> workers = new ArrayList<>();
        HumanWorker humanWorker = new HumanWorker();
        workers.add(humanWorker);
        workers.add(new RobotWorker());


        for (Worker worker : workers) {
            worker.eat(new Food());
        }

        for (Worker worker : workers) {
            worker.work();
        }
    }
}
