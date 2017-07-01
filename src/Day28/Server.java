package Day28;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(33308);
        Socket socket=serverSocket.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader re=new BufferedReader(new InputStreamReader(System.in));
        String line=null;
        while ((line=br.readLine())!=null){

            System.out.println(line);
            bw.write(re.readLine());
            bw.newLine();
            bw.flush();
        }
        br.close();
        re.close();
        bw.close();
        socket.close();


    }
}
