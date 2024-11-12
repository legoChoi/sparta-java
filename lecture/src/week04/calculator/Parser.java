package week04.calculator;

import week04.calculator.exceptions.BadInputException;
import week04.calculator.operations.AddOperation;
import week04.calculator.operations.DivideOperation;
import week04.calculator.operations.MultiplyOperation;
import week04.calculator.operations.SubstractOperation;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public void parseFirstNum(String firstInput) throws BadInputException {
        // 구현 1.
        // 예외 처리: parser 클래스에선 input 값을 필터링해서 지나가게 해주는 기능만을 가지게..
        if (!Pattern.matches(NUMBER_REG, firstInput)) throw new BadInputException("0 이상의 정수 값");

        this.calculator.setFirstNumber(Integer.parseInt(firstInput));
    }

    public void parseSecondNum(String secondInput) throws BadInputException {
        if (!Pattern.matches(NUMBER_REG, secondInput)) throw new BadInputException("0 이상의 정수 값");

        this.calculator.setSecondNumber(Integer.parseInt(secondInput));
    }

    public void parseOperator(String operationInput) throws BadInputException {
        if (!Pattern.matches(OPERATION_REG, operationInput)) throw new BadInputException("올바른 연산자");

        switch (operationInput) {
            case "+":
                this.calculator.setOperation(new AddOperation());
                break;
            case "-":
                this.calculator.setOperation(new SubstractOperation());
                break;
            case "*":
                this.calculator.setOperation(new MultiplyOperation());
                break;
            case "/":
                this.calculator.setOperation(new DivideOperation());
                break;
        }
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}