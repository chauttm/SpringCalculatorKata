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
    public void shouldWorkWithNumbersSeparatedByCommas() {
        assertEquals(3, StringCalculator.add("1,2"));
        assertEquals(7, StringCalculator.add("1,2,4"));
    }

    @Test
    public void shouldWorkWithNumbersSeparatedByNewlines() {
        assertEquals(3, StringCalculator.add("1\n2"));
    }

    @Test
    public void shouldWorkWithNumbersSeparatedByNewlinesOrComma() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }

    @Test
    public void shouldAllowDelimiterDefinition() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }
}
