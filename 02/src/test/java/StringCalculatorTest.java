import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void shouldWorkWithTwoNumbersAndAComma() {
        assertEquals(3, StringCalculator.add("1,2"));
    }

}
