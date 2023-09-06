package bytes;

import java.nio.charset.StandardCharsets;

public class MainApp {

    public static void main(String[] args) {
        String str = "Hello";
        byte[] data = str.getBytes(StandardCharsets.UTF_8);

        for (int i = 0; i < data.length; i++) {
            data[i]++;
        }

        String output = new String(data);
        System.out.println(output);
    }
}
