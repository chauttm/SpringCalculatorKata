import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: dse
 * Date: 6/1/13
 * Time: 9:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculatorTest {
    @Test
    public void shouldReturn0WithNullInput() {
        assertEquals(0, StringCalculator.add(null));
    }

    @Test
    public void shouldReturn0WithEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void shouldWorkWithOneNumber() {
        assertEquals(1, StringCalculator.add("1"));
    }
}
