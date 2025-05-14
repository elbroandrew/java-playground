import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

    private BlockingQueue<String> drop;

    private final String DONE = "DONE";
    private final String[] messages = {
            "aaa",
            "bbb",
            "ccc",
            "ddd"
    };

    public BlockingQueueExample(){
        drop = new ArrayBlockingQueue<String>(1, true);
        (new Thread(new Producer())).start();
        (new Thread(new Consumer())).start();
    }

    class Producer implements Runnable
    {
        public void run(){
            try {
                int count = 0;
                for (int i = 0; i < messages.length; i++) {
                    drop.put(messages[i]);
                    if(++count < 3){
                        Thread.sleep(2000);
                    }
                }
                drop.put(DONE);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    class Consumer implements Runnable{
        public void run(){
            try {
                String msg = null;
                while (!((msg = drop.take()).equals(DONE)))
                {
                    System.out.println(msg);
                }
            }catch (InterruptedException e){
                System.err.println(e.getMessage());
            }
        }
    }

}
