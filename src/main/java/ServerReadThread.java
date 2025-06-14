import java.io.*;
import java.net.Socket;

public class ServerReadThread extends Thread {
    Socket socket;

    public ServerReadThread(Socket socket) {
        this.socket = socket;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName());
                       BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String inLine;
            OutputStream outStream = socket.getOutputStream();
            PrintStream printStream = new PrintStream(outStream);
            while ((inLine = reader.readLine()) != null) {
                printStream.println("(" + socket.getPort() + ") " + inLine);
//                if (reader.readLine().equals("exit")) this.interrupt();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
