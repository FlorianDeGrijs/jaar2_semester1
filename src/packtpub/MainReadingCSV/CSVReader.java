package packtpub.MainReadingCSV;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;

public class CSVReader implements Closeable, Iterable {
    private final BufferedReader reader;
    private int lineCount = 0;

    public CSVReader(BufferedReader reader) throws IOException {
        this(reader, true);
    }

    public CSVReader(BufferedReader reader, boolean ignoreFirst) throws IOException {
        this.reader = reader;
        if (ignoreFirst) {
            reader.readLine();
        }
    }

    @Override
    public void close() throws IOException {
        this.reader.close();
    }

    public String[] readRow() throws IOException {
        String line = this.reader.readLine();
        if (line == null) {
            return null;
        }
        lineCount++;
        return line.split(",");
    }

    public int getLineCount() {
        return lineCount;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
