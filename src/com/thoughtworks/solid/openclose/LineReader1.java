package com.thoughtworks.solid.openclose;


import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class LineReader1 extends LineReader {

    LineReader1(BufferedReader bufferedReader) {
        super(bufferedReader);
    }

    @Override
    public List<String> read() {
        List<String> lines = super.read();
        List<String> everyOtherLine = new ArrayList<>();
        int count = 0;
        for (String line : lines) {
            if (count++%2 == 0){
                everyOtherLine.add(line);
            }
        }
        return everyOtherLine;
    }
}
