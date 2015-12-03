package com.thoughtworks.solid.dependencyinversionexample.consumers;

import com.thoughtworks.solid.dependencyinversionexample.dependencyinversion.DataConsumer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileDataConsumer implements DataConsumer {
    private String outputFileName;

    public FileDataConsumer(String outputFileName) {
        this.outputFileName = outputFileName;
    }

    @Override
    public void consume(List<String> data) {
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (String line : data) {
            printWriter.println(line);
        }
        printWriter.close();
    }
}
