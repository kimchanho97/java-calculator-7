package calculator.model;

import calculator.util.DelimiterUtils;

import static calculator.util.DelimiterConstants.CUSTOM_DELIMITER_SUFFIX;
import static calculator.util.DelimiterConstants.DEFAULT_DELIMITER_REGEX;

public class InputValidator {

    public static void validate(String input) {
        if (DelimiterUtils.isCustomDelimiterInput(input)) {
            validateCustomDelimiter(input);
        } else {
            validateDefaultDelimiter(input);
        }
    }

    private static void validateCustomDelimiter(String input) {
        if (!input.contains(CUSTOM_DELIMITER_SUFFIX)) {
            throw new IllegalArgumentException("커스텀 구분자 형식이 잘못되었습니다.");
        }

        String delimiter = DelimiterUtils.extractCustomDelimiter(input);
        if (delimiter.isEmpty()) {
            throw new IllegalArgumentException("빈 문자열은 구분자로 사용할 수 없습니다.");
        }

        String numbers = input.substring(input.indexOf(CUSTOM_DELIMITER_SUFFIX)
                + CUSTOM_DELIMITER_SUFFIX.length());
        validateNumbers(numbers.split(delimiter));
    }

    private static void validateDefaultDelimiter(String input) {
        String[] numbers = input.split(DEFAULT_DELIMITER_REGEX);
        validateNumbers(numbers);
    }

    private static void validateNumbers(String[] numbers) {
        for (String number : numbers) {
            if (!number.isEmpty()) {
                try {
                    int num = Integer.parseInt(number);
                    if (num < 0) {
                        throw new IllegalArgumentException("음수는 허용되지 않습니다: " + number);
                    }
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("유효하지 않은 숫자입니다: " + number);
                }
            }
        }
    }

}
