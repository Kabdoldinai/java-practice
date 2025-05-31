package org.cases.files;

import java.io.FileInputStream;
import java.io.IOException;

public class MyFileResource implements AutoCloseable {

    private final FileInputStream in;
    private boolean closed = false;

    public MyFileResource(String fileName) throws IOException {
        this.in = new FileInputStream(fileName);
    }

    public int readByte() throws IOException{
        ensureOpen();
        return in.read();
    }

    private void ensureOpen() {
        if (closed) {
            throw new IllegalStateException("Resource is closed");
        }
    }

    @Override
    public void close() throws IOException {
        if(!closed) {
            in.close();
            closed = true;
        }
    }

}
