public class StringCalculator {
    public static int add(String numbers) {
        if (numbers==null) return 0;
        if (numbers.isEmpty()) return 0;

        String delimiterPattern = ",|\n";
        int startOfNumbers = 0;
        if (numbers.startsWith("//")) {
            startOfNumbers = numbers.indexOf('\n') + 1;
            String newDelimiter = numbers.substring(2, 3);
            delimiterPattern += "|" + newDelimiter;
        }
        String[] addends = numbers.substring(startOfNumbers).split(delimiterPattern);
        int sum = 0;
        StringBuffer errorMessage = new StringBuffer();
        for (String number : addends) {
            sum += Integer.parseInt(number);
            if (0>Integer.parseInt(number)) {
                errorMessage.append(" " + number + ",");
            }
        }
        if (errorMessage.length() > 0)
            throw new RuntimeException("negative not allowed:" + errorMessage.toString());
        return sum     ;

    }
}
