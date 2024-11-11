package week03.calculator;

public class DivideOperation extends AbstractOperation {
    @Override
    public double operate(int firstNum, int secondNum) {
        return (double) firstNum / secondNum;
    }
}
