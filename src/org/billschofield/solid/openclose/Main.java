package org.billschofield.solid.openclose;

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


        EveryOtherLineReader reader = new EveryOtherLineReader(lineReader);

        filePrinter = new FilePrinter("output.txt");
        FileReporter everyOtherLineFileReporter = new FileReporter(reader, filePrinter);
        everyOtherLineFileReporter.report();


    }
}
