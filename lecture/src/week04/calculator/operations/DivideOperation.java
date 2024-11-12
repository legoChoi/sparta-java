package week04.calculator.operations;

public class DivideOperation extends AbstractOperation {
    @Override
    public double operate(int firstNum, int secondNum) {
        return (double) firstNum / secondNum;
    }
}
