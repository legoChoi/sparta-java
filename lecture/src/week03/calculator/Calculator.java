package week03.calculator;

public class Calculator {
    // STEP 1, 2
//    private String operator;
//    private int firstNumber, secondNumber;
//
//    public double calculate( String operator, int firstNumber, int secondNumber ) {
//        switch (operator) {
//            case "+": return firstNumber + secondNumber;
//            case "-": return firstNumber - secondNumber;
//            case "*": return firstNumber * secondNumber;
//            case "/": return (double) firstNumber / secondNumber;
////            case "%": return firstNumber % secondNumber;
//            default: break;
//        }
//
//        return 0.0;
//    }final

    // STEP 3
//    private final AddOperation addOperation;
//    private final SubstractOperation substractOperation;
//    private final MultiplyOperation multiplyOperation;
//    private final DivideOperation divideOperation;
//
//    public Calculator(AddOperation addOperation, SubstractOperation substractOperation, MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
//        this.addOperation = addOperation;
//        this.substractOperation = substractOperation;
//        this.multiplyOperation = multiplyOperation;
//        this.divideOperation = divideOperation;
//    }
//
//    public double calculate(String operator, int firstNumber, int secondNumber ) {
//        switch (operator) {
//            case "+": return addOperation.operate(firstNumber, secondNumber);
//            case "-": return substractOperation.operate(firstNumber, secondNumber);
//            case "*": return multiplyOperation.operate(firstNumber, secondNumber);
//            case "/": return divideOperation.operate(firstNumber, secondNumber);
//            default: break;
//        }
//
//        return 0.0;
//    }

    private AbstractOperation abstractOperation;

    public void setAbstractOperation(AbstractOperation abstractOperation) {
        this.abstractOperation = abstractOperation;
    }

    public Calculator(AbstractOperation abstractOperation) {
        this.abstractOperation = abstractOperation;
    }

    public double calculate(int firstNum, int secondNum) {
        return abstractOperation.operate(firstNum, secondNum);
    }
}
