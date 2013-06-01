import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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

    @Test
    public void shouldAllowDelimiterDefinitionAsWellAsDefaultDelimiters() {
        assertEquals(10, StringCalculator.add("//;\n1;2,3\n4"));
    }

    @Test
    public void shouldThrowExceptionWithNegativeInput() {
        try {
            StringCalculator.add("-1,2");
            assertFalse(true);
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().indexOf("negative not allowed") >= 0);
            assertTrue(e.getMessage().indexOf("-1") >= 0);
        }
    }


}
