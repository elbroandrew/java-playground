package Synchronized;

public class Test {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        test.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++){
                    counter++;
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++){
                    counter++;
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter);
    }
}
