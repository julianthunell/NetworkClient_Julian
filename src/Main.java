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
            }
        }
    }
}