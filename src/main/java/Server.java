import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1300);
     //   while (true){
            Socket socket = serverSocket.accept();
            ServerReadThread thread = new ServerReadThread(socket);

//            while (!thread.isAlive()){} //это лишнее с этим циклом поток вечно висит даже если клеинт отключился
            socket.close();
     //   }

//        serverSocket.close();




//        OutputStream outStream = socket.getOutputStream();
//        PrintStream printStream = new PrintStream(outStream);
//        printStream.println("Hello!");
//        socket.close();
//        serverSocket.close();
    }


}
