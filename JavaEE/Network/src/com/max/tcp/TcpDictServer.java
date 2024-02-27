package com.max.tcp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: TcpDictServer
 * Package: com.max.tcp
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/27 21:39
 * @Version 1.0
 */
public class TcpDictServer extends TcpEchoServer{
    private Map<String, String> dict = new HashMap<>();
    public TcpDictServer(int port) throws IOException {
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
        TcpDictServer tcpDictServer = new TcpDictServer(8888);
        tcpDictServer.start();
    }
}
