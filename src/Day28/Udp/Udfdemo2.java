package Day28.Udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Udfdemo2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(33309);
        byte []buff=new byte[100];
        DatagramPacket packet=new DatagramPacket(buff,100);
        socket.receive(packet);
        System.out.println(new String(packet.getData()));

        String str="唉唉唉，我在幼儿园!";
        DatagramPacket packet1=new DatagramPacket(str.getBytes(),str.getBytes().length, packet.getAddress(),packet.getPort());
        socket.send(packet1);
        socket.close();

    }
}
