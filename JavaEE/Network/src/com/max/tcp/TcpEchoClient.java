package com.max.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * ClassName: TcpEchoClient
 * Package: com.max.tcp
 * Description: tcp协议客户端
 *
 * @Author MaxSun
 * @Create 2024/2/26 12:16
 * @Version 1.0
 */
public class TcpEchoClient {
    private Socket socket;
    public TcpEchoClient(String ip, int port) throws IOException {
        socket = new Socket(ip, port);
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        try(InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream()) {
            PrintWriter pw = new PrintWriter(out);
            Scanner scForIn = new Scanner(in);
            while(true) {
                // 发送请求
                System.out.print("-> ");
                String requset = sc.next();
                pw.println(requset);

                pw.flush();

                // 接收响应
                String response = scForIn.next();

                System.out.printf("req: %s resp: %s\n", requset, response);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        TcpEchoClient tcpEchoClient = new TcpEchoClient("127.0.0.1", 8888);
        tcpEchoClient.start();
    }
}
