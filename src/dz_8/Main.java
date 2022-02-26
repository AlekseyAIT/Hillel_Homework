package dz_8;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ChildThread childThread = new ChildThread();
        Thread thread = new Thread(childThread);
        thread.start();

        try {
            System.out.println("Main thread is sleeping!");
            Thread.sleep(3L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is not sleeping now!");

        Thread.sleep(2L * 1000L); // 2 sec
        thread.interrupt();

        System.out.println("Main thread is finished!");
    }

    static class ChildThread implements Runnable {
        Thread thisThread = Thread.currentThread();

        @Override
        public void run() {
                while (!thisThread.isInterrupted()) {
                    System.out.println(Thread.currentThread().getName() + " is working!");
                    try {
                        Thread.sleep(2L * 1000L);
                        System.out.println(Thread.currentThread().getName() + " is sleeping!");
                    } catch (InterruptedException e) {
                        thisThread.interrupt();
                    }
                }
            System.out.println("Child thread is finished!");
        }
    }
}