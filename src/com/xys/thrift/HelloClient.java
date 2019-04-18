package com.xys.thrift;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class HelloClient {
    public static final String SERVER_IP = "localhost";
    public static final int SERVER_PORT = 8080;
    public static final int TIMEOUT = 30000;

    public static void main(String[] args) throws Exception {
        HelloClient client = new HelloClient();
        client.startClient("XYS");
    }

    public void startClient(String userName) throws Exception {
        // 创建 TTransport
        TTransport transport = new TSocket(SERVER_IP, SERVER_PORT, TIMEOUT);
        // 创建 TProtocol
        TProtocol protocol = new TBinaryProtocol(transport);

        // 创建客户端.
        HelloWorldService.Client client = new HelloWorldService.Client(protocol);
        
        // 打开 TTransport
        transport.open();
        
        // 调用服务方法
        String result = client.sayHello(userName);
        System.out.println("Result: " + result);

        transport.close();
    }
}
