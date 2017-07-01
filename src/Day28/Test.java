package Day28;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Test {
    public static void main(String[] args) {
        try {
            InetAddress in = InetAddress.getLocalHost();
            System.out.println(in.toString());
            System.out.println("IP "+in.getHostAddress());
            System.out.println("name"+in.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}