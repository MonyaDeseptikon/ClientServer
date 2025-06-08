import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1300);
        while (true){
            System.out.println(Thread.currentThread().getName());
            Socket socket = serverSocket.accept();
        ServerReadThread thread = new ServerReadThread(socket);
        }
//        serverSocket.close();
    }
}
