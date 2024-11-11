package week02.collection;

import java.util.HashSet;

public class Col05 {
    public static void main(String[] args) {
        // Set : 집합, 순서 X  중복 X
        // HashSet, TreeSet 응용
        // Set은 생성자 없어서 바로 생성 X

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(12);
        hashSet.add(5);
        hashSet.add(9);
        hashSet.add(1);
        hashSet.add(12);

        for (Integer i : hashSet) System.out.println(i);

        System.out.println(hashSet.contains(12));
        System.out.println(hashSet.contains(2));
    }
}
