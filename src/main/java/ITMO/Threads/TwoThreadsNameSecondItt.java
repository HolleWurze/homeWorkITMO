package ITMO.Threads;

public class TwoThreadsNameSecondItt extends Thread {
    private String name;

    public TwoThreadsNameSecondItt(String name) {
        this.name = name;
    }

    public void run() {
        while (true) {
            synchronized (this) {
                System.out.println(name);
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class ThreadsMain {
    public static void main(String[] args) {
        TwoThreadsNameSecondItt t1 = new TwoThreadsNameSecondItt("Первый поток");
        TwoThreadsNameSecondItt t2 = new TwoThreadsNameSecondItt("Второй поток");

        t1.start();
        t2.start();

        while (true) {
            synchronized (t1) {
                t1.notify();
            }
            synchronized (t2) {
                t2.notify();
            }
        }
    }
}
