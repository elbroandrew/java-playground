

public static void main(String[] args) throws InterruptedException {

    StopRun stopRun = new StopRun();
    Thread t1 = new Thread(stopRun, "TEST");
    t1.setDaemon(true);
    t1.start();
    System.out.println(t1.threadId());
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    System.out.println("requesting stop");
    stopRun.requestStop();
    System.out.println("stop requested");

//    t1.join();

}


public static class StopRun implements Runnable{

    private boolean stopped = false;

    public synchronized void requestStop(){
        this.stopped = true;

    }

    public synchronized boolean isStopRequested(){
        return this.stopped;
    }

    @Override
    public void run() {
        while (!isStopRequested()){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }

    }
}






