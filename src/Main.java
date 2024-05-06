import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        Socket client = null;

        //Default port number
        int portNumber = 4321;
        if (args.length >= 1){
            portNumber = Integer.parseInt(args[0]);
        }

        for (int i = 0; i < 10; i++) {
            try{
                String message = "";

                //Create a client socket
                client = new Socket(InetAddress.getLocalHost(), portNumber);
                System.out.println("Client socket is created" + client);
                
                //Create output stream
                OutputStream clientOut = client.getOutputStream();
                PrintWriter pw = new PrintWriter(clientOut, true);
                
                //Create an input stream of the client socket
                InputStream clientIn = client.getInputStream();
                BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter your name. Type Bye to exit");;
                
                //read data from standard input device and write it
                //to the outpust stream fo the client socket
                message = stdIn.readLine().trim();
                pw.println(message);
            }
        }
    }
}