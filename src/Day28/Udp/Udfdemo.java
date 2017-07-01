package Day28.Udp;

import java.io.IOException;
import java.net.*;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Udfdemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket();
        String str="喂喂喂，你在哪里呀?";
        DatagramPacket packet=new DatagramPacket(str.getBytes(),str.getBytes().length, InetAddress.getByName("localhost"),33309);
        socket.send(packet);

       byte []buff=new byte[100];
        DatagramPacket packet1=new DatagramPacket(buff,100);
        socket.receive(packet1);
        System.out.println(new String(packet1.getData()));
        socket.close();
    }
}
