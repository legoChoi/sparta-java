package week03.calculator;

public class Calculator {
    private String operator;
    private int firstNumber, secondNumber;

    public double calculate( String operator, int firstNumber, int secondNumber ) {
        switch (operator) {
            case "+": return firstNumber + secondNumber;
            case "-": return firstNumber - secondNumber;
            case "*": return firstNumber * secondNumber;
            case "/": return (double) firstNumber / secondNumber;
//            case "%": return firstNumber % secondNumber;
            default: break;
        }

        return 0.0;
    }


}
