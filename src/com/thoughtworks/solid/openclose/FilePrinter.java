package com.thoughtworks.solid.openclose;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

class FilePrinter {
    private String outputFileName;

    FilePrinter(String outputFileName) {
        this.outputFileName = outputFileName;
    }

    public void print(List<String> lines) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(outputFileName));
        for (String line : lines) {
            out.println(line);
        }
        out.close();
    }
}
