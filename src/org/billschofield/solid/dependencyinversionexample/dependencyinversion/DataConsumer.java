package org.billschofield.solid.dependencyinversionexample.dependencyinversion;

import java.util.List;

public interface DataConsumer {
    void consume(List<String> data);
}
