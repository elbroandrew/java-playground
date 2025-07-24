package Algorithm.Exercises.ThreadDemo;

public class ThreadDemo {

    public static void main(String[] args) {
        NewThread nt1 = new NewThread("thread-1");
        NewThread nt2 = new NewThread("thread-2");
        NewThread nt3 = new NewThread("thread-3");
        NewThread nt4 = new NewThread("thread-4");
        nt1.thread.start();
        nt2.thread.start();
        nt3.thread.start();
        nt4.thread.start();

        try {

            Thread.sleep(10000);

        }catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Finishing the main thread.");
    }
}
