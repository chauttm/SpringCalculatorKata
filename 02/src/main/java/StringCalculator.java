public class StringCalculator {

    private static String defaultDelimiterPattern = ",|\n";

    public static int add(String numbers) {
        if (numbers==null) return 0;
        if (numbers.isEmpty()) return 0;

        String delimiterPattern = getDelimiterPattern(numbers);
        int startOfNumbers = getStartOfNumbers(numbers);
        String[] addends = numbers.substring(startOfNumbers).split(delimiterPattern);

        int sum = 0;
        StringBuffer errorMessage = new StringBuffer();
        for (String number : addends) {
            if (1000<Integer.parseInt(number)) continue;
            sum += Integer.parseInt(number);
            if (0 > Integer.parseInt(number)) {
                errorMessage.append(" " + number + ",");
            }
        }
        if (errorMessage.length() > 0)
            throw new RuntimeException("negative not allowed:" + errorMessage.toString());
        return sum;
    }

    private static String getDelimiterPattern(String numbers) {
        if (numbers.startsWith("//"))
            return (defaultDelimiterPattern + "|" + numbers.substring(2, 3));
        return defaultDelimiterPattern;
    }

    private static int getStartOfNumbers(String numbers) {
        if (numbers.startsWith("//"))
            return numbers.indexOf('\n') + 1;
        return 0;
    }
}
