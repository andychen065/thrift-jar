package com.xys.thrift;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;

public class HelloServer {
    public static final int SERVER_PORT = 8080;

    public static void main(String[] args) throws Exception {
        HelloServer server = new HelloServer();
        server.startServer();
    }

    public void startServer() throws Exception {
        // 创建 TProcessor
        TProcessor tprocessor = 
                new HelloWorldService.Processor<HelloWorldService.Iface>(new HelloWorldImpl());

        // 创建 TServerTransport, TServerSocket 继承于 TServerTransport
        TServerSocket serverTransport = new TServerSocket(SERVER_PORT);
        
        // 创建 TProtocol
        TProtocolFactory protocolFactory = new TBinaryProtocol.Factory();
        
        TServer.Args tArgs = new TServer.Args(serverTransport);
        tArgs.processor(tprocessor);
        tArgs.protocolFactory(protocolFactory);

        // 创建 TServer
        TServer server = new TSimpleServer(tArgs);
        // 启动 Server
        server.serve();
    }
}
