
import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class CaesarCipher {

    private static final int ALPHABET_SIZE = 26;

    public String cipher(String message, int encode) {
        // rotate by only the size of the alphabet:
        encode %= ALPHABET_SIZE;
        char[] chars = message.toCharArray();
        rotate(chars, encode);
        return new String(chars);
    }

    private void rotate(char[] chars, int encode) {
        for (int i = 0; i < chars.length; ++i) {
            if (isLowerCase(chars[i])) {
                chars[i] = rotateChar(chars[i], encode, 'a', 'z');
            } else if (isUpperCase(chars[i])) {
                chars[i] = rotateChar(chars[i], encode, 'A', 'Z');
            }
        }
    }

    private char rotateChar(char c, int encode, char firstChar, char lastChar) {
        c += encode;
        if (c < firstChar) {
            return (char) (c + ALPHABET_SIZE);
        }
        if (c > lastChar) {
            return (char) (c - ALPHABET_SIZE);
        }
        return c;
    }
}