package pers.java.socket;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int port = 8919;
        try {
            ServerSocket server = new ServerSocket(port);
            Socket socket = server.accept();
            Reader reader = new InputStreamReader(socket.getInputStream());
            char chars[] = new char[1024];
            int len;
            StringBuilder builder = new StringBuilder();
            while ((len=reader.read(chars)) != -1) {
               builder.append(new String(chars, 0, len));
            }
            System.out.println("Receive from client message=: " + builder);
            reader.close();
            socket.close();
            server.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
