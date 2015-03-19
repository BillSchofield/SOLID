package com.thoughtworks.solid.srp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReporter fileReporter = new FileReporter("output.txt", new BufferedReader(new FileReader("input.txt")));
        fileReporter.report();
    }
}
