package ITMO.Threads;

public class Threads_2tsk extends Thread {
    public static void main(String[] args) {
        Thread thread = new Threads_2tsk();
        System.out.println(thread.getState());
        if (thread.getState() == State.NEW) {
            thread.start();
            System.out.println(thread.getState());
            try {
                thread.join();
                System.out.println(thread.getState());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        thread.interrupt();
        if (thread.isInterrupted()) {
            System.err.println("Поток успешно удален!");
        }
    }
}
