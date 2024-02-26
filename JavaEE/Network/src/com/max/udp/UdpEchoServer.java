package com.max.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * ClassName: EchoServer
 * Package: com.max.echo
 * Description: 回显通讯服务器
 *
 * @Author MaxSun
 * @Create 2024/2/25 17:02
 * @Version 1.0
 */
public class UdpEchoServer {
    private DatagramSocket datagramSocket;

    public UdpEchoServer(int port) throws SocketException {
        datagramSocket = new DatagramSocket(port); // 服务器需要指定端口号
    }


    /**
     * 启动服务器方法
     */
    public void start() throws IOException {
        System.out.println("服务器启动");
        while (true) {
            // 服务器从客户端接收数据
            DatagramPacket requestPacket = new DatagramPacket(new byte[4096], 4096); // 接收客户端发来的请求存入的DatagramPacket对象
            datagramSocket.receive(requestPacket);

            // 服务器解析请求数据
            String request = new String(requestPacket.getData(), 0, requestPacket.getLength());
            String response = process(request);

            // 服务器返回响应给客户端
            DatagramPacket responsePacket = new DatagramPacket(response.getBytes(), response.getBytes().length, requestPacket.getSocketAddress());
            datagramSocket.send(responsePacket);

            // 打印日志
            System.out.printf("[%s:%d] req: %s resp: %s\n", requestPacket.getAddress().toString(), requestPacket.getPort(), request, response);
        }
    }

    public String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        UdpEchoServer echoServer = new UdpEchoServer(9090);

        echoServer.start();
    }
}
