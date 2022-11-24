package sync2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
    }
}

class Worker {
    Random random = new Random();

    Object lock1 = new Object();
    Object lock2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public  void addToList1() {
        synchronized(lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void addToList2() {
        synchronized(lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void work(){
        for(int i = 0; i < 100; ++i){
            addToList1();
            addToList2();
        }
    }

    public void main() throws InterruptedException {



        long before = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long after = System.currentTimeMillis();
        System.out.println("Program took " + (after - before) + " ms to run."); //397 ms
        System.out.println("List1: " + list1.size());
        System.out.println("List2: " + list2.size());
    }
}