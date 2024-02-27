package com.max.udp;

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: UdpDictServer
 * Package: com.max.udp
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/27 20:36
 * @Version 1.0
 */
public class UdpDictServer extends UdpEchoServer{
    private Map<String, String> dict = new HashMap<>();
    public UdpDictServer(int port) throws SocketException {
        super(port);
        dict.put("love", "爱");
        dict.put("no", "不");
        dict.put("yes", "是");
        dict.put("come", "来");
        dict.put("go", "去");
        dict.put("hello", "你好");
    }

    @Override
    public String process(String request) {
        return dict.getOrDefault(request, "没有该单词");
    }

    public static void main(String[] args) throws IOException {
        UdpDictServer udpDictServer = new UdpDictServer(9090);
        udpDictServer.start();
    }
}
