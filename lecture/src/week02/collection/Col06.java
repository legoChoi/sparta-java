package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Col06 {
    public static void main(String[] args) {
        // Map : key - value
        Map<String, Integer> map = new HashMap<>();

        map.put("일", 11);
        map.put("이", 12);
        map.put("삼", 13);
        map.put("삼", 14);
        map.put("삼", 15);
        map.put("삼", 16);

        for (String k : map.keySet()) System.out.println(k);

        for (Integer v : map.values()) System.out.println(v); // 동일한 키 값이 들어갈 경우 마지막 value가 저장 됨

        System.out.println(map.get("삼"));
    }
}
