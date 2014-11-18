package com.thoughtworks.solid.dependencyinversion;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReporter fileReporter = new FileReporter("input.txt", "output.txt");
        fileReporter.report();

    }
}
