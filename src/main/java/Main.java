import org.jetbrains.annotations.Nullable;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[6];
        Arrays.setAll(array, i -> (int) (Math.random() * 10));
        System.out.println(Arrays.toString(array));
        int[] ar = sumRecursive(array);
    }

    static int[] sumRecursive(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(arr.length);
        for (Integer i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        System.out.println(hm);
        return arr;
    }
}


