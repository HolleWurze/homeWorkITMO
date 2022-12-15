package ITMO.Threads;

public class TwoThreadsNameSecondItt extends Thread {
    public static void main(String[] args) {
        Object object = new Object();
        methodSynchronizedThreads(object);
    }

    public static void methodSynchronizedThreads(Object obj) {
        for (int i = 0; i < 100; i++) {
            takesNameThreads(i);
        }
    }

    private static void takesNameThreads(int i) {
        Thread thread = new Thread();
        synchronized (thread) {
            if (i % 2 == 0) {
                thread.setName("Второй поток");
            } else {
                thread.setName("Первый поток");
            }
            System.out.println(thread.getName());
        }
    }
}
