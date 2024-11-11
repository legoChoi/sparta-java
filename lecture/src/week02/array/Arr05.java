package week02.array;

public class Arr05 {
    public static void main(String[] args) {
        String str = "ABCD";

        // 1. substring(int from, int to)
        String strSub = str.substring(0, 3);
        System.out.println(strSub);

        // 2. equals(String str)
        String newStr = "ABCD";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);
    }
}
