package calculator.model;

import calculator.util.DelimiterUtils;

import static calculator.util.DelimiterConstants.*;

public class StringSplitter {

    public static String[] splitByDelimiter(String input) {
        if (DelimiterUtils.isCustomDelimiterInput(input)) {
            String customDelimiter = DelimiterUtils.extractCustomDelimiter(input);
            return splitByCustomDelimiter(input, customDelimiter);
        }
        return splitByDefaultDelimiters(input);
    }

    private static String[] splitByCustomDelimiter(String input, String delimiter) {
        String numbers = input.substring(input.indexOf(CUSTOM_DELIMITER_SUFFIX) +
                CUSTOM_DELIMITER_SUFFIX.length());
        return numbers.split(delimiter);
    }

    private static String[] splitByDefaultDelimiters(String input) {
        return input.split(DEFAULT_DELIMITER_REGEX);
    }
}
