/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author Роман
 */
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9090);
            while (true){
                Socket socket = server.accept();
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                String str = (String) ois.readObject();
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                oos.writeObject("size:"+str.length());
                ois.close();
                oos.close();
                socket.close();
                if(str.equals("exit")){
                    break;
                }
            }
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

