package calculator.controller;

import calculator.model.InputValidator;
import calculator.model.StringCalculator;
import calculator.model.StringSplitter;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {

    public void run() {
        String input = InputView.getInput();

        InputValidator.validate(input);
        String[] stringNumbers = StringSplitter.splitByDelimiter(input);

        int result = StringCalculator.calculate(stringNumbers);
        OutputView.printResult(result);

    }
}
