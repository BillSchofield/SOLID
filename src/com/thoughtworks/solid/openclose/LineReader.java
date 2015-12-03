package com.thoughtworks.solid.openclose;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class LineReader implements Reader {
    private BufferedReader bufferedReader;

    LineReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    @Override
    public List<String> read() {
        List<String> lines = new ArrayList<>();
        try {
            while (bufferedReader.ready()) {
                lines.add(bufferedReader.readLine());
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
