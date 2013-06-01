public class StringCalculator {
    public static int add(String numbers) {
        if (numbers==null) return 0;
        if (numbers.isEmpty()) return 0;

        String[] addends = numbers.split(",|\n");
        int sum = 0;
        for (String number : addends) {
            sum += Integer.parseInt(number);
        }

        return sum     ;

    }
}
