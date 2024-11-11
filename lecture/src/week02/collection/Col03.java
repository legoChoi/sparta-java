package week02.collection;

import java.util.Stack;

public class Col03 {
    public static void main(String[] args) {
        // Stack : FILO
        // push, pop, peek
        // 최근 저장 데이터 나열, 데이터 중복 처리를 막고 싶을 때

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(15);
        stack.push(1);

        while (!stack.isEmpty()) System.out.println(stack.pop());

        stack.push(10);
        stack.push(15);
        stack.push(1);

        System.out.println(stack.peek()); // 최상단 값 조회
        System.out.println(stack.size());
    }
}
