package week04.calculator.operations;

public class AddOperation extends AbstractOperation {
    @Override
    public double operate(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
