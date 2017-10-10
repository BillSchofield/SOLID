package org.billschofield.solid.openclose;

import java.io.*;
import java.util.List;

public class FileReporter {
    private final FilePrinter filePrinter;
    private Reader reader;

    public FileReporter(Reader reader, FilePrinter filePrinter) {
        this.reader = reader;
        this.filePrinter = filePrinter;
    }

    public void report() throws IOException {
        List<String> lines = reader.read();
        filePrinter.print(lines);
    }

}
