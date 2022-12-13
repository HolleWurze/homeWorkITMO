package ITMO.Threads;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Threads_1tsk();
            thread.start();
            CountNum(thread, counter);
        }
        System.out.println(counter.getCount());
    }

    private static void CountNum(Thread thread, Counter counter) {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }


}
