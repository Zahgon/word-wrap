package org.davidmoten.text.utils;

import java.io.IOException;

public interface LineConsumer {

    void write(char[] chars, int offset, int length) throws IOException;

    void writeNewLine() throws IOException;

    default void write(String s) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
