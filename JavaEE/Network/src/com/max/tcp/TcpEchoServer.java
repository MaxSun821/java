package com.max.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName: TcpEchoServer
 * Package: com.max.tcp
 * Description: tcp协议服务器
 *
 * @Author MaxSun
 * @Create 2024/2/26 12:16
 * @Version 1.0
 */
public class TcpEchoServer {
    private ServerSocket socket;

    public TcpEchoServer(int port) throws IOException {
        socket = new ServerSocket(port);
    }

    public void start() throws IOException {
        // 创建线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        System.out.println("服务器启动");
        while(true) {
            Socket clientSocket = socket.accept();
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        processConnection(clientSocket);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void processConnection(Socket clientSocket) throws IOException {
        System.out.printf("[%s:%d] 客户端上线！\n", clientSocket.getInetAddress().toString(),
                clientSocket.getPort());
        // 接收客户端请求
        try(InputStream in = clientSocket.getInputStream();
            OutputStream out = clientSocket.getOutputStream()) {

            // 将字节流转成字符流
            Scanner sc = new Scanner(in);
            PrintWriter pw = new PrintWriter(out);
            while(true) {
                if(!sc.hasNext()) {
                    System.out.printf("[%s:%d] 客户端下线！\n", clientSocket.getInetAddress().toString(),
                            clientSocket.getPort());
                    break;
                }
                String request = sc.next(); // 获取请求
                // 服务器处理请求
                String response = process(request);
                // 将响应封装
                pw.println(response);

                pw.flush();

                // 打印日志
                System.out.printf("[%s:%d] req: %s resp: %s\n", clientSocket.getInetAddress().toString()
                , clientSocket.getPort(), request, response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            clientSocket.close();
        }
    }

    private String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        TcpEchoServer tcpEchoServer = new TcpEchoServer(8888);
        tcpEchoServer.start();
    }
}

