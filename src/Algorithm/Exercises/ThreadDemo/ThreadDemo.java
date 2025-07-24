package Algorithm.Exercises.ThreadDemo;

public class ThreadDemo {

    public static void main(String[] args) {
        NewThread nt1 = new NewThread("thread-1");
        NewThread nt2 = new NewThread("thread-2");
        NewThread nt3 = new NewThread("thread-3");
        nt1.thread.start();
        nt2.thread.start();
        nt3.thread.start();

        System.out.println(nt1.name + " is running: " + nt1.thread.isAlive());
        System.out.println(nt2.name + " is running: " + nt2.thread.isAlive());
        System.out.println(nt3.name + " is running: " + nt3.thread.isAlive());

        try {

            nt1.thread.join();
            nt2.thread.join();
            nt3.thread.join();

        }catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println(nt1.name + " is still running " + nt1.thread.isAlive());
        System.out.println(nt2.name + " is still running " + nt2.thread.isAlive());
        System.out.println(nt3.name + " is still running " + nt3.thread.isAlive());
        System.out.println("Finishing the main thread.");
    }
}
