package ITMO.Threads;

public class Threads_1tsk extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Threads_1tsk();
            thread.start();
            enteringNum(thread);
        }
    }

    private static void enteringNum(Thread num) {
        for (int i = 0; i <= 100; i++) {
            if (i < 100) {
                System.out.print(i + ", ");
            } else if (i == 100) {
                System.out.println(i);
            }
        }
    }
}
