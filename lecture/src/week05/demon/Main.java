package week05.demon;

public class Main {
    public static void main(String[] args) {
        Runnable demon = () -> {
            for (int i = 0; i < 1000000; i++) {
                System.out.println(i + " demon");
            }
        };

        // demon : 우선 순위 낮음
        // 다른 스레드에 비해 리소스가 적게 할당 됨
        // main 스레드 작업이 끝나면 데몬 스레드도 자동으로 종료시킴
        Thread thread = new Thread(demon);
        thread.setDaemon(true);

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i + " task");
        }
    }
}
