package com.xys.thrift;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TNonblockingServerSocket;

public class HsHaHelloServer {
    public static final int SERVER_PORT = 8080;

    public static void main(String[] args) throws Exception {
        HsHaHelloServer server = new HsHaHelloServer();
        server.startServer();
    }

    public void startServer() throws Exception {
        TProcessor tprocessor = new HelloWorldService.Processor<HelloWorldService.Iface>(
                new HelloWorldImpl());

        TNonblockingServerSocket serverTransport = new TNonblockingServerSocket(SERVER_PORT);
        THsHaServer.Args tArgs = new THsHaServer.Args(serverTransport);
        tArgs.processor(tprocessor);
        tArgs.protocolFactory(new TBinaryProtocol.Factory());

        TServer server = new THsHaServer(tArgs);
        server.serve();
    }
}
