package ITMO.Threads;

public class RunThread extends Thread {
    Counter counter;

    public RunThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        synchronized (counter) {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
    }
}

