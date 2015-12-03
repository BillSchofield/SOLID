package com.thoughtworks.solid.dependencyinversionexample;


import com.thoughtworks.solid.dependencyinversionexample.consumers.FileDataConsumer;
import com.thoughtworks.solid.dependencyinversionexample.dependencyinversion.DependencyInvertedFileReporter;
import com.thoughtworks.solid.dependencyinversionexample.provider.FileDataProvider;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ConventionalFileReporter fileReporter = new ConventionalFileReporter("input_file.txt", "output_file.txt");
        fileReporter.report();

        fileReporter = new ConventionalFileReporter(new FileDataProvider("input_file.txt"), new FileDataConsumer("output_file.txt"));
        fileReporter.report();

        DependencyInvertedFileReporter diFileReporter = new DependencyInvertedFileReporter(new FileDataProvider("input_file.txt"), new FileDataConsumer("output_file.txt"));
        diFileReporter.report();
    }
}
