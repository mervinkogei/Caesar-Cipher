import org.junit.*;
import org.junit.Assert.*;

import static junit.framework.TestCase.assertEquals;

public class CaesarCipherTest {
    private CaesarCipher caesar = new CaesarCipher();

    @Test
    public void shouldNotCipherSymbols() {
//        assertEquals("-",caesar.cipher("-",3));
        String symbols = "1!@#$%^&*(){}[]/";
        assertEquals(symbols, caesar.cipher(symbols, 3));
    }

    @Test
    public void shouldNotBeEmptyString() {
        assertEquals("", caesar.cipher("", 3));
    }

    @Test
    public void shouldCipherUpperCaseLetter() {
        assertEquals("A", caesar.cipher("A", 0));
    }

    @Test
    public void shouldDecipher() {
        String s = "aoeu";

        String encrypted = caesar.cipher(s, 2);

        assertEquals(s, caesar.cipher(encrypted, -2));
    }


    @Test
    public void shouldCipherWholeAlphabet() {
        String allChars = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD",
                caesar.cipher(allChars, -3));
    }
}

