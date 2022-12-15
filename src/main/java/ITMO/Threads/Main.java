package ITMO.Threads;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            RunThread runThread = new RunThread(counter);
            executorService.execute(runThread);
        }
        executorService.shutdown();
        while (!executorService.awaitTermination(50, TimeUnit.MILLISECONDS)) {
        }
        System.out.println(counter.count);
    }
}
