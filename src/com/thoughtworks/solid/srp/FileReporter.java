package com.thoughtworks.solid.srp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReporter {
    private final String inputFileName;
    private final String outputFileName;

    public FileReporter(String inputFileName, String outputFileName) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
    }

    public void report() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(inputFileName));
        List<String> lines = new ArrayList<String>();
        while (in.ready()) {
            lines.add(in.readLine());
        }
        in.close();

        PrintWriter out = new PrintWriter(new FileWriter(outputFileName));
        for (String line : lines) {
            out.println(line);
        }
        out.close();
    }
}
