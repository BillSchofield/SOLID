package com.thoughtworks.solid.dependencyinversion.provider;

import com.thoughtworks.solid.dependencyinversion.DataProvider;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileDataProvider implements DataProvider {
    private String inputFileName;

    public FileDataProvider(String inputFileName) {
        this.inputFileName = inputFileName;
    }

    @Override
    public List<String> provide() {
        List<String> lines = new ArrayList<String>();
        Reader fileReader;
        try {
            fileReader = new FileReader(inputFileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return lines;
        }
        BufferedReader in = new BufferedReader(fileReader);
        try {
            while (in.ready()) {
                lines.add(in.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
