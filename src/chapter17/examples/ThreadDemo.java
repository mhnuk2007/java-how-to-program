package chapter17.examples;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable thread1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Value of i: " + i + " by thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable thread2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Value of i multiplied by 2: " + (i * 2) + " by thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000); // 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(thread1);
        t1.setName("JOHN");
        t1.start();

        Thread t2 = new Thread(thread2);
        t2.setName("MIKE");
        t2.start();

        // Optional: Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}
