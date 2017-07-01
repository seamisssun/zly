package Day28;

import java.io.*;
import java.net.Socket;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.130.49", 33308);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line=null;
        BufferedReader re=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while ((line=br.readLine())!=null) {

            bw.write(line);
            bw.newLine();
            bw.flush();

            System.out.println(re.readLine());
        }
        bw.close();
        re.close();
        br.close();
        socket.close();


    }

}
