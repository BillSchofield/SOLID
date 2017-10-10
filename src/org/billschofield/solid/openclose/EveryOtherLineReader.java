package org.billschofield.solid.openclose;

import java.util.ArrayList;
import java.util.List;

public class EveryOtherLineReader implements Reader{
    private Reader reader;

    public EveryOtherLineReader(Reader reader) {
        this.reader = reader;
    }

    @Override
    public List<String> read() {
        List<String> lines = reader.read();
        List<String> ourLines = new ArrayList<>();
        int counter = 0;
        for (String line : lines) {
            if (counter++ % 2 == 0){
                ourLines.add(line);
            }
        }
        return ourLines;
    }
}
