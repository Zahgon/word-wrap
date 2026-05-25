package org.davidmoten.text.utils;

import java.util.Arrays;

final class StringBuilder2 implements CharSequence {

    private char[] chars;

    private int length;

    StringBuilder2(String s) {
        this(s.toCharArray(), s.length());
    }

    StringBuilder2() {
        this(new char[16], 0);
    }

    private StringBuilder2(char[] chars, int length) {
        this.chars = chars;
        this.length = length;
    }

    char[] internalArray() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int length() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public char charAt(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void append(StringBuilder2 s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void checkSize(int len) {
        if (length + len > chars.length) {
            chars = Arrays.copyOf(chars, newSize(len));
        }
    }

    private int newSize(int len) {
        int newSize = chars.length * 2;
        if (newSize < length + len) {
            newSize = length + len;
        }
        return newSize;
    }

    public void setLength(int length) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void append(char ch) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void delete(int start, int end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String substring(int start, int end) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Trims right space from this and returns {@code this}.
     *
     * @return this
     */
    StringBuilder2 rightTrim() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
