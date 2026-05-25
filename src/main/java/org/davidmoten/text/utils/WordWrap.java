package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import com.github.davidmoten.guavamini.Preconditions;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;

public final class WordWrap {

    private WordWrap() {
        // prevent instantiation
    }

    private static final String SPECIAL_WORD_CHARS = "\"\'\u2018\u2019\u201C\u201D?./!,;:_";

    public static final Set<Character> SPECIAL_WORD_CHARS_SET_DEFAULT = toSet(SPECIAL_WORD_CHARS);

    private static final Function<CharSequence, Number> STRING_WIDTH_DEFAULT = s -> s.length();

    private static final String PUNCTUATION = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    /**
     * Sets the source to be wrapped and returns a builder to specify more
     * parameters.
     *
     * @param reader source to be wrapped
     * @return builder
     */
    public static Builder from(Reader reader) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the source to be wrapped as a classpath resource which will be read
     * using the UTF-8 character set. Returns a builder to specify more parameters.
     * Uses an 8192 byte buffer for reading.
     *
     * @param resource source to be wrapped as a classpath resource
     * @return builder
     */
    public static Builder fromClasspathUtf8(String resource) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the source to be wrapped as a classpath resource to be read using the
     * given character set. Returns a builder to specify more parameters. Uses an
     * 8192 byte buffer for reading.
     *
     * @param resource classpath resource name
     * @param charset  charset to use for reading
     * @return builder
     */
    public static Builder fromClasspath(String resource, Charset charset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the the source to be wrapped and returns a builder to specify more
     * parameters. Uses an 8192 byte buffer for reading.
     *
     * @param text text to be wrapped
     * @return builder
     */
    public static Builder from(CharSequence text) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the source to be wrapped. Returns a builder to specify more parameters.
     * Uses an 8192 byte buffer for reading.s
     *
     * @param in source to be wrapped
     * @return builder
     */
    public static Builder fromUtf8(InputStream in) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the source to be wrapped and the character set to be used to read it.
     * Uses an 8192 byte buffer for reading. Returns a builder to specify more
     * parameters.
     *
     * @param in      source to be wrapped
     * @param charset encoding
     * @return builder
     */
    public static Builder from(InputStream in, Charset charset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the source to be wrapped and the character set to be used to read it.
     * Uses an 8192 byte buffer for reading. Returns a builder to specify more
     * parameters.
     *
     * @param file    file to be read
     * @param charset charset of the text in the source file
     * @return builder
     */
    public static Builder from(File file, Charset charset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @VisibleForTesting
    static Builder from(Reader reader, boolean close) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Provides method chaining for specifying parameters to word wrap.
     */
    public static final class Builder {

        private final Reader reader;

        private final boolean closeReader;

        private Number maxWidth = 80;

        private Function<? super CharSequence, ? extends Number> stringWidth = STRING_WIDTH_DEFAULT;

        private Set<Character> extraWordChars = SPECIAL_WORD_CHARS_SET_DEFAULT;

        private String newLine = "\n";

        private boolean insertHyphens = true;

        private boolean breakWords = true;

        Builder(Reader reader, boolean closeReader) {
            this.reader = reader;
            this.closeReader = closeReader;
        }

        /**
         * Sets the maximum width of a line using the {@code stringWidth} function. Word
         * wrapping/splitting will be attempted for lines with greater than
         * {@code maxWidth}. If not set the default is 80.
         *
         * @param maxWidth maximum width of a line using the {@code stringWidth}
         *                 function.
         * @return this
         * @throws IllegalArgumentException if {@code maxWidth} is less than or equal to
         *                                  zero
         */
        public Builder maxWidth(Number maxWidth) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Sets the string width function used to determine if a line is at maximum
         * width (and therefore needing wrapping or splitting). If not set the string
         * width function is the number of characters.
         *
         * @param stringWidth function that returns the width of a sequence of
         *                    characters
         * @return this
         */
        public Builder stringWidth(Function<? super CharSequence, ? extends Number> stringWidth) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Sets the newLine string to be used. If not set the default is '\n' (line feed
         * character).
         *
         * @param newLine string to be output on for a new line delimiter
         * @return this
         */
        public Builder newLine(String newLine) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Sets all extra word characters (characters that will be treated like normal
         * alphabetic characters for defining word boundaries).
         *
         * @param extraWordChars extra word characters (in addtion to alphabetic
         *                       characters)
         * @return this
         */
        public Builder extraWordChars(Set<Character> extraWordChars) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Sets all extra word characters (characters that will be treated like normal
         * alphabetic characters for defining word boundaries).
         *
         * @param extraWordChars extra word characters (in addtion to alphabetic
         *                       characters)
         * @return this
         */
        public Builder extraWordChars(String extraWordChars) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Adds more word characters (characters that will be treated like normal
         * alphabetic characters for defining word boundaries).
         *
         * @param includeWordChars more word characters
         * @return this
         */
        public Builder includeExtraWordChars(String includeWordChars) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Adds extra word characters to be excluded. Alphabetic characters are always
         * word characters and thus will be ignored here.
         *
         * @param excludeWordChars extra word characters to be excluded
         * @return this
         */
        public Builder excludeExtraWordChars(String excludeWordChars) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * If we want to mutate the default extraWordChars set then we replace it with a mutable
         * set just for use by this builder. This is done lazily as a perf enhancement
         * (reduces allocations if a lot of calls to wrap are being made).
         */
        private void prepareExtraWordCharsForMutation() {
            if (this.extraWordChars == SPECIAL_WORD_CHARS_SET_DEFAULT) {
                this.extraWordChars = new HashSet<>(SPECIAL_WORD_CHARS_SET_DEFAULT);
            }
        }

        /**
         * Sets if to break words using a hyphen character. If set to false then no
         * breaking character will be used.
         *
         * @param insertHyphens whether to break hyphens
         * @return this
         */
        public Builder insertHyphens(boolean insertHyphens) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * If a word is longer than {@code maxWidth} and {@code breakWords} is true then
         * such a word will be broken across two or more lines (with or without a hyphen
         * according to {@link Builder#insertHyphens(boolean)}).
         *
         * @param breakWords if true then break words across lines
         * @return this
         */
        public Builder breakWords(boolean breakWords) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Performs the wrapping of the source text and writes output to the given
         * {@link Writer}.
         *
         * @param out output for wrapped text
         */
        public void wrap(Writer out) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public List<String> wrapToList() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void wrap(LineConsumer consumer) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Performs the wrapping of the source text and writes output to the given file
         * with the given character set encoding.
         *
         * @param file    file to receive wrapped output
         * @param charset encoding to use for output
         */
        public void wrap(File file, Charset charset) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Performs the wrapping of the source text and writes the output to the given
         * file using UTF-8 encoding.
         *
         * @param file output file for wrapped text
         */
        public void wrapUtf8(File file) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Performs the wrapping of the source text and writes the output to a file with
         * the given filename.
         *
         * @param filename output file for wrapped text
         */
        public void wrapUtf8(String filename) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Performs the wrapping of the source text and writes the output to a file with
         * the given filename using the given encoding.
         *
         * @param filename output file for the wrapped text
         * @param charset  encoding to use for output
         */
        public void wrap(String filename, Charset charset) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Performs the wrapping of the source text and returns output as a String.
         *
         * @return wrapped text
         */
        public String wrap() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    @VisibleForTesting
    static void close(Reader reader) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static Set<Character> toSet(String chars) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < chars.length(); i++) {
            set.add(chars.charAt(i));
        }
        return set;
    }

    static void wordWrap(Reader in, Writer out, String newLine, Number maxWidth, Function<? super CharSequence, ? extends Number> stringWidth, Set<Character> extraWordChars, boolean insertHyphens, boolean breakWords) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void wordWrap(Reader in, LineConsumer out, Number maxWidth, Function<? super CharSequence, ? extends Number> stringWidth, Set<Character> extraWordChars, boolean insertHyphens, boolean breakWords) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static CharSequence concatRightTrim(CharSequence a, CharSequence b) {
        return new CharSequenceConcatRightTrim(a, b);
    }

    private static boolean isPunctuation(char ch) {
        return PUNCTUATION.indexOf(ch) != -1;
    }

    private static boolean tooLong(Function<? super CharSequence, ? extends Number> stringWidth, CharSequence s, double maxWidthDouble) {
        return stringWidth.apply(s).doubleValue() > maxWidthDouble;
    }

    @VisibleForTesting
    static CharSequence rightTrim(CharSequence s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static boolean isWhitespace(CharSequence s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @VisibleForTesting
    static void leftTrim(StringBuilder2 word) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static String leftTrim(String s) {
        StringBuilder2 b = new StringBuilder2(s);
        leftTrim(b);
        return b.toString();
    }

    private static void appendWordToLine(StringBuilder2 line, StringBuilder2 word) {
        line.append(word);
        word.setLength(0);
    }

    private static void writeBrokenWord(LineConsumer out, StringBuilder2 word, boolean insertHyphens) throws IOException {
        // to be really thorough we'd check the new stringWidth with '-' but let's not
        // bother for now
        String x;
        if (insertHyphens && word.length() > 2 && !isWhitespace((x = word.substring(0, word.length() - 2)))) {
            out.write(x);
            out.write("-");
            out.writeNewLine();
            word.delete(0, word.length() - 2);
        } else {
            String prefix = word.substring(0, word.length() - 1);
            if (!isWhitespace(prefix)) {
                out.write(prefix);
            }
            out.writeNewLine();
            word.delete(0, word.length() - 1);
        }
    }

    private static void writeLine(LineConsumer out, StringBuilder2 line) throws IOException {
        out.write(line.internalArray(), 0, line.length());
        out.writeNewLine();
        line.setLength(0);
    }
}
