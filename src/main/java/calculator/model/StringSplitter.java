package calculator.model;

import java.util.ArrayList;
import java.util.List;

public class StringSplitter {

    public static List<Integer> split(ParsedInput parsedInput) {
        List<Integer> list = new ArrayList<>();
        String numbersWithDelimiter = parsedInput.getNumbersWithDelimiter();
        String delimiterRegex = parsedInput.getDelimiterRegex();

        String[] numbers = numbersWithDelimiter.split(delimiterRegex);
        for (String number : numbers) {
            if (!number.isEmpty()) {
                list.add(Integer.valueOf(number));
            }
        }
        return list;
    }
}
