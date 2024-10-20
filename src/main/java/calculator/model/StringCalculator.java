package calculator.model;

public class StringCalculator {

    public static int calculate(String[] stringNumbers) {
        int sum = 0;
        for (String stringNumber : stringNumbers) {
            if (!stringNumber.isEmpty()) {
                sum += Integer.parseInt(stringNumber);
            }
        }
        return sum;
    }
}
