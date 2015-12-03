package com.thoughtworks.solid.openclose;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/input.txt"));
        LineReader lineReader = new LineReader(bufferedReader);
        FilePrinter filePrinter = new FilePrinter("output.txt");

        FileReporter fileReporter = new FileReporter(lineReader, filePrinter);
        fileReporter.report();


        FileReporter fileReporter1 = new FileReporter(
                new EveryOtherLineReader(
                        new EveryOtherLineReader(lineReader)
                ), filePrinter);
        fileReporter1.report();



//        EveryOtherLineReader reader = new EveryOtherLineReader(lineReader);
//
//        FilePrinter filePrinter = new FilePrinter("output.txt");
//        FileReporter everyOtherLineFileReporter = new FileReporter(reader, filePrinter);
//        everyOtherLineFileReporter.report();


    }
}