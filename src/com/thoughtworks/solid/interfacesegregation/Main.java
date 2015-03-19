package com.thoughtworks.solid.interfacesegregation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HumanWorker bob = new HumanWorker();
        Worker bender = new RobotWorker();

        List<Worker> workers = new ArrayList<Worker>();
        workers.add(bob);
        workers.add(bender);

        List<Eater> eaters = new ArrayList<Eater>();
        eaters.add(bob);

        for (Eater eater : eaters) {
            eater.eat(new Food());
        }

        for (Worker worker : workers) {
            worker.work();
        }
    }
}
