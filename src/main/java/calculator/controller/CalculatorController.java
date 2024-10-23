package calculator.controller;

import calculator.model.Calculator;
import calculator.model.ValidatedInput;
import calculator.model.Validator;
import calculator.model.ValidatorFactory;
import calculator.view.InputView;
import calculator.view.OutputView;
import java.util.List;

public class CalculatorController {

    public void run() {
        String input = InputView.getInput();

        Validator validator = ValidatorFactory.createValidator(input);
        ValidatedInput validatedInput = validator.validate(input);

        List<Integer> numbers = validatedInput.extractNumbers();

        int result = Calculator.plus(numbers);
        OutputView.printResult(result);
    }
}
