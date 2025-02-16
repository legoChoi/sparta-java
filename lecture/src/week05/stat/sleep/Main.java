package week05.stat.sleep;

//public class Main {
//    public static void main(String[] args) {
//        Runnable task = () -> {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("task : " + Thread.currentThread().getName());
//        };
//
//        Thread thread = new Thread(task, "Thread");
//        thread.start();
//
//        try {
//            thread.sleep(1000);
//            System.out.println("sleep(1000) : " + Thread.currentThread().getName());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}


public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        thread.interrupt();

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

    }
}