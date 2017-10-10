package org.billschofield.solid.srp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReporter {
    private final String outputFileName;
    private BufferedReader bufferedReader;

    public FileReporter(String outputFileName, BufferedReader bufferedReader) throws FileNotFoundException {
        this.bufferedReader = bufferedReader;
        this.outputFileName = outputFileName;
    }

    public void report() throws IOException {
        List<String> lines = new ArrayList<>();
        while (bufferedReader.ready()) {
            lines.add(bufferedReader.readLine());
        }
        bufferedReader.close();

        PrintWriter out = new PrintWriter(new FileWriter(outputFileName));
        for (String line : lines) {
            out.println(line);
        }
        out.close();
    }
}
