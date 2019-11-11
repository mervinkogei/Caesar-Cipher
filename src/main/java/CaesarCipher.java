import java.io.Console;
import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class CaesarCipher {

    private static final int ALPHABET_SIZE = 26;
    Scanner console = new Scanner(System.in);

    public String cipher(String message, int encode) {
        // rotate by only the size of the alphabet:
//        Console myConsole = System.console();
        System.out.println("Enter your encryption message: ");
        String a = console.nextLine();
        encode %= ALPHABET_SIZE;
        char[] chars = message.toCharArray();
        encrypt(chars, encode);
        return new String(chars);
    }

    private void encrypt(char[] chars, int encode) {
        for (int i = 0; i < chars.length; ++i) {
            if (isLowerCase(chars[i])) {
                chars[i] = encodeChar(chars[i], encode, 'a', 'z');
            } else if (isUpperCase(chars[i])) {
                chars[i] = encodeChar(chars[i], encode, 'A', 'Z');
            }
        }
    }

    private char encodeChar(char c, int encode, char firstChar, char lastChar) {
        c += encode;
        if (c < firstChar) {
            return (char) (c + ALPHABET_SIZE);
        }
        if (c > lastChar) {
            return (char) (c - ALPHABET_SIZE);
        }
        return c;
//        System.out.print(c);
    }
}