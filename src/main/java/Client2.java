import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {
        InetAddress address = InetAddress.getLocalHost();
        Socket client = new Socket(address, 1300);



        InputStream inStream = client.getInputStream();
        OutputStream outStream = client.getOutputStream();

        DataInputStream dataInputStream = new DataInputStream(inStream);
        PrintStream printStream = new PrintStream(outStream);

        printStream.println("Hello! Im the Client2");
        System.out.println(dataInputStream.readLine());

        String inLine;
        Scanner scanner = new Scanner(System.in);
        while (!(inLine = scanner.nextLine()).equals("exit")){
            printStream.println(inLine);
            System.out.println(dataInputStream.readLine());
        }

        client.close();
    }
}
