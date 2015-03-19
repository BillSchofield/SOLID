package com.thoughtworks.solid.dependencyinversion;

import java.util.List;

public interface DataProvider {
    List<String> provide();
}
