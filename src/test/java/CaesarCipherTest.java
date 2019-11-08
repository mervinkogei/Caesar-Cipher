import org.junit.*;
import org.junit.Assert.*;

import static junit.framework.TestCase.assertEquals;

public class CaesarCipherTest {
    private CaesarCipher caesar = new CaesarCipher();

    @Test
    public void shouldNotCipherSymbols(){
//        assertEquals("-",caesar.cipher("-",3));
        String symbols="1!@#$%^&*(){}[]/";
                assertEquals(symbols,caesar.cipher(symbols,3));
    }
}
