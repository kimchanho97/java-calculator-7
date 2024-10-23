package calculator.model;

import static calculator.constant.DelimiterConstants.CUSTOM_DELIMITER_EXTRACTION_REGEX;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorFactory {

    private ValidatorFactory() {
    }

    public static Validator createValidator(String input) {
        Matcher matcher = Pattern.compile(CUSTOM_DELIMITER_EXTRACTION_REGEX).matcher(input);
        if (matcher.matches()) {
            return new CustomValidator();
        }
        return new DefaultValidator();
    }
}
