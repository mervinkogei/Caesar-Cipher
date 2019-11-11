import org.junit.Test;
import static org.junit.Assert.*;

public class EncryptTest {
    Encrypt testEncoding = new Encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 2);

    @Test
    public void checkIfItCreatesInstance()
    {
        assertEquals(true, testEncoding instanceof Encrypt);
    }
    @Test
    public void checkIfSavesInputText()
    {
        Encrypt en = new Encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",23);

        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", en.encode() );
    }

    @Test
    public void checkKeyIsSaved()
    {
        assertEquals(2,testEncoding.getKey());
    }

    @Test
    public void isValidInputText()
    {
        assertEquals(true, testEncoding.isValidInputText());

    }

    @Test
    public void isValidKey()
    {
        assertEquals(true, testEncoding.isValidKey());
    }

//    @Test
//    public void validDecoding()
//    {
//        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG" , testEncoding.encode());
//    }
}
