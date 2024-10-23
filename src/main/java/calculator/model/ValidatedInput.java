package calculator.model;

import java.util.ArrayList;
import java.util.List;

public class ValidatedInput {

    private final String delimiterRegex;
    private final String numbersWithDelimiter;

    public ValidatedInput(String delimiterRegex, String numbersWithDelimiter) {
        this.delimiterRegex = delimiterRegex;
        this.numbersWithDelimiter = numbersWithDelimiter;
    }

    public List<Integer> extractNumbers() {
        ArrayList<Integer> list = new ArrayList<>();

        String[] numbers = numbersWithDelimiter.split(delimiterRegex);
        for (String number : numbers) {
            if (!number.isEmpty()) {
                list.add(Integer.valueOf(number));
            }
        }
        return list;
    }

    public String getDelimiterRegex() {
        return delimiterRegex;
    }

    public String getNumbersWithDelimiter() {
        return numbersWithDelimiter;
    }
}
