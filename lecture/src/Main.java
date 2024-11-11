package lecture.src;

public class Main {
    public static void main(String[] args) {

        upTo5(0);

    }

    public static void upTo5 (int a) {
        System.out.println(a);

        if (a < 5) {
            upTo5(++a);
        } else {
            System.out.println(a);
        }

        System.out.println(a);
    }
}