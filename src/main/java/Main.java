import java.lang.Thread.State;

public static void main(String[] args) throws InterruptedException {


    BlockingQueue<String> drop  = new ArrayBlockingQueue<String>(1, true);

    Thread t1 = new Thread(new Producer(drop));
    Thread t2 = new Thread(new Consumer(drop));
    t1.start();
    t2.start();

    //Monitor thread states
    while (true) {

        Thread.sleep(500);
        Thread.State prodState = t1.getState();
        Thread.State consState = t2.getState();

        System.out.println(prodState + ", " + consState);
    }


//    System.out.println("finished");

}


public static class Producer implements Runnable{

    private BlockingQueue<String> drop;
    public Producer(BlockingQueue<String> drop){
        this.drop = drop;
    }

    @Override
    public void run() {
        System.out.println("from runnable class");
        for (int i = 0; i < 5; i++) {
            try {
                drop.put(String.format("%s", i));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

public static class Consumer implements Runnable{

    BlockingQueue<String> drop;
    public Consumer(BlockingQueue<String> drop){
        this.drop = drop;
    }

    @Override
    public void run() {
        System.out.println("from runnable class");
        while (true){
            try {
                drop.take();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}



