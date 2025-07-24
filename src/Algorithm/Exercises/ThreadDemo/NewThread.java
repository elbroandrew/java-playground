package Algorithm.Exercises.ThreadDemo;

public class NewThread implements Runnable {

    Thread thread;
    String name;
    NewThread(String name){
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("New thread " + thread + " started");
    }

    @Override
    public void run() {
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " thread is done.");
    }

}
