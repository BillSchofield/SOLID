package com.thoughtworks.solid.dependencyinversion;


import com.thoughtworks.solid.dependencyinversion.consumers.FileDataConsumer;
import com.thoughtworks.solid.dependencyinversion.provider.FileDataProvider;

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
