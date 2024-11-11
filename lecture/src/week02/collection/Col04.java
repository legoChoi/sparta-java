package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col04 {
    public static void main(String[] args) {
        // Queue : FIFO
        // add, poll, peek
        // 생성자가 없는 인터페이스
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(5);
        queue.add(9);

        while (!queue.isEmpty()) System.out.println(queue.poll());

        queue.add(1);
        queue.add(5);
        queue.add(9);

        System.out.println(queue.peek()); // 맨 앞의 값 조회
        System.out.println(queue.size());
    }
}
