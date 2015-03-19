package com.thoughtworks.solid.dependencyinversion;

import com.thoughtworks.solid.dependencyinversion.consumers.FileDataConsumer;
import com.thoughtworks.solid.dependencyinversion.provider.FileDataProvider;

import java.io.IOException;
import java.util.List;

public class ConventionalFileReporter {
    private DataProvider provider;
    private DataConsumer consumer;

    public ConventionalFileReporter(String inputFile, String outputFile) {
        provider = new FileDataProvider(inputFile);
        consumer = new FileDataConsumer(outputFile);
    }

    public ConventionalFileReporter(FileDataProvider provider, FileDataConsumer consumer) {
        this.provider = provider;
        this.consumer = consumer;
    }

    public void report() throws IOException {
        List<String> data = provider.provide();
        consumer.consume(data);
    }

}
