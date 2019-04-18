import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import java.io.IOException;

import org.apache.thrift.TApplicationException;
import org.apache.thrift.TException;
import org.apache.thrift.async.TAsyncClientManager;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingSocket;
import org.apache.thrift.transport.TNonblockingTransport;
import org.apache.thrift.transport.TSocket;
public class Client2 {  
    public static final String address = "127.0.0.1";  
    public static final int port = 8989;  
    public static final int clientTimeout = 30000;  
  
    public static void main_syn() {  
        TTransport transport = new TFramedTransport(new TSocket(address, port, clientTimeout));  
        TProtocol protocol = new TCompactProtocol(transport);  
        TestServ.Client client = new TestServ.Client(protocol);  
  
        try {  
            transport.open();  
            System.out.println(client.helloString("larry"));  
  
        } catch (TApplicationException e) {  
            System.out.println(e.getMessage() + " " + e.getType());  
        } catch (TTransportException e) {  
            e.printStackTrace();  
        } catch (TException e) {  
            e.printStackTrace();  
        }  
        transport.close();  
    }  
  
    public static void main_asy() throws Exception {  
        try {  
            TAsyncClientManager clientManager = new TAsyncClientManager();  
            TNonblockingTransport transport = new TNonblockingSocket(address, port, clientTimeout);  
            TProtocolFactory protocol = new TCompactProtocol.Factory();  
            TestServ.AsyncClient asyncClient = new TestServ.AsyncClient(protocol, clientManager, transport);  
            System.out.println("Client calls .....");  
            MyCallback callBack = new MyCallback();  
            asyncClient.helloString("larry", callBack);  
  
            while (true) {  
                Thread.sleep(1);  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
      
    public static void main(String[] args) throws Exception {  
        main_asy();  
    }  
}  
