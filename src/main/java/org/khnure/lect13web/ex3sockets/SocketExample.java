package org.khnure.lect13web.ex3sockets;

import java.net.*;
import java.io.*;

public class SocketExample {
    public static void main(String[] args) throws Exception {
        // Server
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket clientSocket = serverSocket.accept();

        // Client
        Socket socket = new Socket("localhost", 8080);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
    }
}
