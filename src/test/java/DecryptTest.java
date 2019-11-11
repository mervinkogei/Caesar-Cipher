import org.junit.Test;
import static org.junit.Assert.*;

public class DecryptTest {

        Decrypt testDecoding = new Decrypt( 23, "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD");
        @Test
        public void checkIfSavesInputText()
        {
            assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", testDecoding.getInputText() );
        }

        @Test
        public void checkKeyIsSaved()
        {
            assertEquals(2,testDecoding.getKey());
        }

        @Test
        public void isValidInputText()
        {
            assertEquals(true, testDecoding.isValidInputText());
        }

        @Test
        public void isValidKey()
        {
            assertEquals(true, testDecoding.isValidKey());
        }

        @Test
        public void validDecoding()
        {
            assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG" , testDecoding.decode());
        }
    }

