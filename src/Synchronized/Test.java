package Synchronized;

public class Test {
    private int counter;

    public static void main(String[] args) {
        Test test = new Test();
        test.doWork();
    }

    public void doWork(){
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

        System.out.println(counter);
    }
}
