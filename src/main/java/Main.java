import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {

        f();

    }

    static void f(){
        String hostname = "www.google.com";
        int port = 80;

        try (Socket socket = new Socket(hostname, port)) {

            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            writer.println("GET / HTTP/1.1");
            writer.println("Host: " + hostname);
            writer.println("User-Agent: Simple Http Client");
            writer.println("Accept: text/html");
            writer.println("Accept-Language: en-US");
            writer.println("Connection: close");
            writer.println();

            writer.flush();
            System.out.println("SENT MESSAGE: " + writer);


        } catch (UnknownHostException ex) {

            System.out.println("Server not found: " + ex.getMessage());

        } catch (IOException ex) {

            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}
