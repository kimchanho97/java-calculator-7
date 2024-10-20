package calculator.util;

import static calculator.util.DelimiterConstants.CUSTOM_DELIMITER_PREFIX;
import static calculator.util.DelimiterConstants.CUSTOM_DELIMITER_SUFFIX;

public class DelimiterUtils {

    public static boolean isCustomDelimiterInput(String input) {
        return input.startsWith(CUSTOM_DELIMITER_PREFIX);
    }

    public static String extractCustomDelimiter(String input) {
        return input.substring(CUSTOM_DELIMITER_PREFIX.length(), input.indexOf(CUSTOM_DELIMITER_SUFFIX));
    }
}
