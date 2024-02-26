package com.max.udp;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * ClassName: EchoClient
 * Package: com.max.echo
 * Description: 回显通讯客户端
 *
 * @Author MaxSun
 * @Create 2024/2/25 17:03
 * @Version 1.0
 */
public class UdpEchoClient {
    private DatagramSocket datagramSocket;
    private String serverAddr;
    private int serverPort;

    public UdpEchoClient(String serverAddr, int serverPort) throws SocketException {
        datagramSocket = new DatagramSocket(); // 客户端不需要指定端口号，只需要系统自动分配即可
        this.serverAddr = serverAddr;
        this.serverPort = serverPort;
    }

    public void start() throws IOException {

        Scanner sc = new Scanner(System.in);

        while(true) {
            // 客户端输入请求
            System.out.print("-> ");
            String request = sc.next();
            // 客户端发送请求
            DatagramPacket requestPacket = new DatagramPacket(request.getBytes(), request.getBytes().length, InetAddress.getByName(serverAddr), serverPort);
            datagramSocket.send(requestPacket);

            // 客户端接收服务器响应
            DatagramPacket responsePacket = new DatagramPacket(new byte[4096], 4096);
            datagramSocket.receive(responsePacket);

            String response = new String(responsePacket.getData(), 0, responsePacket.getLength());
            // 打印
            System.out.printf("req: %s resp: %s\n", request, response);
        }
    }

    public static void main(String[] args) throws IOException {
        UdpEchoClient echoClient = new UdpEchoClient("127.0.0.1", 9090);
        echoClient.start();
    }
}
