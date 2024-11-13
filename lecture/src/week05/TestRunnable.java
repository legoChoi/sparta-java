package week05;

// 2. Runnable interface 이용
// 더 많이 쓰임

public class TestRunnable implements Runnable {
    @Override
    public void run() {
        // 실제 스레드에서 수행 할 작업
        for (int i = 0; i < 100; i++) {
            System.out.print("$");
        }
    }
}
