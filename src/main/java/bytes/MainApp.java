package bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MainApp {

    public static void main(String[] args) {
        byte[] buffer = new byte[12];

        try (
                FileInputStream in = new FileInputStream("src/main/java/bytes/input.txt");
                FileOutputStream out = new FileOutputStream("src/main/java/bytes/out.txt");
        )  {
            int n = in.read(buffer);
            out.write(buffer, 0, n);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
