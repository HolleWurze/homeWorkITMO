package ITMO.Threads;

public class TwoThreadsNameSecondItt {
    private static final Object lock = new Object();
    private static boolean toggle = true;


    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread("Первый поток"));
        Thread t2 = new Thread(new MyThread("Второй поток"));

        t1.start();
        t2.start();
    }

    static class MyThread implements Runnable {
        private String name;

        public MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (toggle != name.equals("Первый поток")) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(name);
                    toggle = !toggle;
                    lock.notifyAll();
                }
            }
        }
    }
}
