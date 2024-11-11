package week03.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator(new AddOperation());
        System.out.println(cal.calculate(3, 8));

        cal.setAbstractOperation(new SubstractOperation());
        System.out.println(cal.calculate(3, 8));

        cal.setAbstractOperation(new MultiplyOperation());
        System.out.println(cal.calculate(3, 8));

        cal.setAbstractOperation(new DivideOperation());
        System.out.println(cal.calculate(3, 8));
    }
}
