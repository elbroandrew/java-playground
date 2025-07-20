package Algorithm.Utils;

public class Stopwatch {
    static long startTime;
    static long endTime;
    static boolean isRunning = false;
    public static void start(){
        startTime = System.nanoTime();
        isRunning = true;
    }

    public static void stop(){
        if(isRunning){
            isRunning = false;
            endTime = System.nanoTime();
            System.out.println("time: " + ((endTime - startTime)/1_000_000.0) + "mills");
        }
    }

    public static void reset(){
        startTime = 0;
        endTime = 0;
        isRunning = false;
    }
}
