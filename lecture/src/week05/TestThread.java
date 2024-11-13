package week05;

// 1. Thread class 이용

public class TestThread extends Thread {
    @Override
    public void run() {
        // 실제 스레드에서 수행 할 작업
        for (int i = 0; i < 100; i++) {
            System.out.print("*");
        }
    }
}
