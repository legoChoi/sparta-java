package week02.collection;

import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {
        // List
        // List(ArrayList) = 동적 배열, 초기화 시 길이 필요 X => 크기가 가변적
        // Array = 정적 배열, 초기화 시 길이 필요 O

        ArrayList<Integer> intList = new ArrayList<Integer>();

        System.out.println(intList);
        System.out.println(intList.size());
        System.out.println();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.println(intList);
        System.out.println(intList.size());
        System.out.println();

        intList.set(1, 99);

        System.out.println(intList);
        System.out.println(intList.size());
        System.out.println();

        intList.remove(0);

        System.out.println(intList);
        System.out.println(intList.size());
        System.out.println();

        intList.clear();

        System.out.println(intList);
        System.out.println(intList.size());
        System.out.println();
    }
}
