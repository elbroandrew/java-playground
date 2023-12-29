import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

// increment a variable every 2 seconds by 1

public class NumbersServiceImpl {

    public static void counter(){
        var currentValue = new AtomicLong();
        var executor = Executors.newScheduledThreadPool(1);
        Runnable task = () -> {
            var value = currentValue.incrementAndGet();
            if (value > 5){
                executor.shutdown();
                System.out.println("Sequence of numbers was completed.");
            }
        };
        executor.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
    }


}
