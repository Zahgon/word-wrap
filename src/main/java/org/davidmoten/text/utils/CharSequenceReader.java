/*
 * Copyright (C) 2013 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.davidmoten.text.utils;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import com.github.davidmoten.guavamini.Preconditions;

/**
 * A {@link Reader} that reads the characters in a {@link CharSequence}. Like
 * {@code StringReader}, but works with any {@link CharSequence}.
 *
 * @author Colin Decker
 */
// TODO(cgdecker): make this public? as a type, or a method in CharStreams?
final class CharSequenceReader extends Reader {

    private CharSequence seq;

    private int pos;

    private int mark;

    public CharSequenceReader(CharSequence seq) {
        this.seq = Preconditions.checkNotNull(seq);
    }

    private void checkOpen() throws IOException {
        if (seq == null) {
            throw new IOException("reader closed");
        }
    }

    private boolean hasRemaining() {
        return remaining() > 0;
    }

    private int remaining() {
        return seq.length() - pos;
    }

    @Override
    public synchronized int read(CharBuffer target) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public synchronized int read() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public synchronized int read(char[] cbuf, int off, int len) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public synchronized long skip(long n) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public synchronized boolean ready() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean markSupported() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public synchronized void mark(int readAheadLimit) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public synchronized void reset() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public synchronized void close() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
