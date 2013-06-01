/**
 * Created with IntelliJ IDEA.
 * User: dse
 * Date: 6/1/13
 * Time: 9:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public static int add(String numbers) {
        if (numbers==null) return 0;
        if (numbers.isEmpty()) return 0;
        return Integer.parseInt(numbers);
    }
}
