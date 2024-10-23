package calculator.model;

import static calculator.constant.DelimiterConstants.DEFAULT_DELIMITER_REGEX;

import calculator.util.NumberValidator;

public class DefaultValidator implements Validator {

    @Override
    public ValidatedInput validate(String input) {
        String[] numbers = input.split(DEFAULT_DELIMITER_REGEX);
        NumberValidator.validateNumbers(numbers);

        return new ValidatedInput(DEFAULT_DELIMITER_REGEX, input);
    }
}
