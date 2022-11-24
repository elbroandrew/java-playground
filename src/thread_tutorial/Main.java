package thread_tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        m.shutdown();
    }
}

class MyThread extends Thread{
    private boolean running = true;
    @Override
    public void run() {
        while (running){
            System.out.println("HELLO");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void shutdown(){
        this.running = false;
    }
}


