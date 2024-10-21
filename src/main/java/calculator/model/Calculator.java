package calculator.model;

import java.util.List;

public class Calculator {

    public static int calculate(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }
}
