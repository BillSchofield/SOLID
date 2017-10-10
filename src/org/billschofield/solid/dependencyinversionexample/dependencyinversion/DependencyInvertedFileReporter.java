package org.billschofield.solid.dependencyinversionexample.dependencyinversion;

import java.io.*;
import java.util.List;

public class DependencyInvertedFileReporter {
    private DataProvider provider;
    private DataConsumer consumer;

    public DependencyInvertedFileReporter(DataProvider provider, DataConsumer consumer) {
        this.provider = provider;
        this.consumer = consumer;
    }

    public void report() throws IOException {
        List<String> data = provider.provide();
        consumer.consume(data);
    }
}
