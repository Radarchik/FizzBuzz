package FizzBuzz.FizzBuzzTest;



import FizzBuzz.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * Created by tszin on 05/06/2017.
 */
public class FizzBuzzTest {

    /**
     * Test of IsDivisorThree method, of class FizzBuzz.
     */
    @Test
    public void testIsDivisorThree() {
        System.out.println("IsDivisorThree");
        int i = 99;
        boolean expResult = true;
        boolean result = FizzBuzz.IsDivisorThree(i);
        assertEquals(expResult, result);

    }

    /**
     * Test of IsDivisorFive method, of class FizzBuzz.
     */
    @Test
    public void testIsDivisorFive() {
        System.out.println("IsDivisorFive");
        int i = 10;
        boolean expResult = true;
        boolean result = FizzBuzz.IsDivisorFive(i);
        assertEquals(expResult, result);

    }

    /**
     * Test of HasDigitThree method, of class FizzBuzz.
     */
    @Test
    public void testHasDigitThree() {
        System.out.println("HasDigitThree");
        int i = 73;
        boolean expResult = true;
        boolean result = FizzBuzz.HasDigitThree(i);
        assertEquals(expResult, result);

    }

    /**
     * Test of HasDigitFive method, of class FizzBuzz.
     */
    @Test
    public void testHasDigitFive() {
        System.out.println("HasDigitFive");
        int i = 56;
        boolean expResult = true;
        boolean result = FizzBuzz.HasDigitFive(i);
        assertEquals(expResult, result);

    }


}
