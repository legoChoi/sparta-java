package week04.calculator.operations;

public class MultiplyOperation extends AbstractOperation {
    @Override
    public double operate(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
}
