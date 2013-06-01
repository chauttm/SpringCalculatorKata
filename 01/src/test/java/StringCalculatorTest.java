import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: dse
 * Date: 5/26/13
 * Time: 7:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculatorTest {
    @Test
    public void addWithEmptyStringReturns0() {
        assertEquals(0, StringCalculator.add(""));
    }
    @Test
    public void addWithOneNumbersReturnItsValue() {
        assertEquals(1, StringCalculator.add("1"));
    }
    @Test
    public void addWithTwoNumbersSeparatedByComma() {
        assertEquals(3, StringCalculator.add("1,2"));
    }
    @Test
    public void addWithUnknownNumberOfNumbersSeparatedByCommas() {
        assertEquals(6, StringCalculator.add("1,2,3"));
    }
    @Test
    public void addWithTwoNumbersSeparatedByANewline() {
        assertEquals(3, StringCalculator.add("1\n2"));
    }
    @Test
    public void addWithNumbersSeparatedByOneNewlineOrOneComma() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }
    @Test
     public void addSupportDelimiterSpecification() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }
    @Test
    public void addSupportDelimiterSpecificationAsWellAsDefault() {
        assertEquals(10, StringCalculator.add("//;\n1;2\n3,4"));
    }
    @Test
    public void addWithOneNegativeAddendThrowsException() {
        try {
            StringCalculator.add("-2,3");
            assertTrue("No exception was thrown", false);
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("-2"));
        }
    }
    @Test
    public void addWithNegativesAddendPassesAllNegativesToException() {
        try {
            StringCalculator.add("-2,-3");
            assertTrue("No exception was thrown", false);
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("-2"));
            assertTrue(e.getMessage().contains("-3"));
        }
    }
}
