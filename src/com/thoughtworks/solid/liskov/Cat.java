package com.thoughtworks.solid.liskov;

public class Cat implements Animal {
    @Override
    public String speak() {
        return "Meow";
    }
}
