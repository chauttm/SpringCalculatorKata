/**
 * Created with IntelliJ IDEA.
 * User: dse
 * Date: 5/26/13
 * Time: 7:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public static int add(String s) {
        if (s.equals(""))     return 0;
        if (!s.startsWith("//"))
            return addWithDelimiters(s, "\n|,");
        int endOfFirstLineIndex = s.indexOf("\n");
        String delimiter = s.substring(2,endOfFirstLineIndex);
        return addWithDelimiters(s.substring(endOfFirstLineIndex + 1), delimiter);
    }
    private static int addWithDelimiters(String s, String delimiterPattern) {
        if (delimiterPattern.isEmpty()) delimiterPattern = "\n|,";
        else delimiterPattern += "|\n|,";
        String[] addends = s.split(delimiterPattern);
        int sum = 0;
        String negativeAddends = "";
        for (String addend : addends) {
            int addendValue = Integer.parseInt(addend);
            if (addendValue < 0) negativeAddends += addend + ",";
            sum += addendValue;
        }
        if (!negativeAddends.isEmpty())
            throw new RuntimeException("negatives are not allowed: " + negativeAddends);
        return sum;
    }
}
