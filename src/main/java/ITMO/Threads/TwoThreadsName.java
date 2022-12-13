package ITMO.Threads;

public class TwoThreadsName extends Thread {
    public static void main(String[] args) {
        Thread thread1 = new TwoThreadsName();
        Thread thread2 = new TwoThreadsName();
        thread1.setName("Первый поток");
        thread2.setName("Второй поток");
        for (int i = 0; i < 100; i++) {
            thread1.run();
            try {
                System.out.println(thread1.getName());
                thread1.join();
                thread2.run();
                System.out.println(thread2.getName());
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        thread1.interrupt();
        thread2.interrupt();
        if (thread1.isInterrupted() || thread2.isInterrupted()){
            System.err.println("Потоки остановлены!");
        }
    }
}
