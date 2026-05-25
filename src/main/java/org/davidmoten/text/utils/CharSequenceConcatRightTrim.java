package org.davidmoten.text.utils;

final class CharSequenceConcatRightTrim implements CharSequence {

    private final CharSequence a;

    private final CharSequence b;

    CharSequenceConcatRightTrim(CharSequence a, CharSequence b) {
        this.a = a;
        this.b = b;
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

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
