package com.thoughtworks.solid.dependencyinversion;

import java.util.List;

public interface DataConsumer {
    void consume(List<String> data);
}
