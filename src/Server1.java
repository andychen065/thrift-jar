import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TNonblockingServer.Args;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TTransportException;

import service.demo.Hello;
import service.demo.HelloImpl;

public class Server1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) { 
	       TNonblockingServerTransport serverTransport; 
	       try { 
	           serverTransport = new TNonblockingServerSocket(10005);
	           
	           TestServ.Processor processor = new TestServ.Processor(new TestServImpl());
	           
	           TBinaryProtocol.Factory proFactory = new TBinaryProtocol.Factory(); 
	           
	           TServer server = new TNonblockingServer( 
	        		   new Args(serverTransport)
	        		   .processor(processor)
	        		   .protocolFactory(proFactory)); 
	           System.out.println("Start server on port 10005 ..."); 
	           server.serve(); 
	       } catch (TTransportException e) { 
	           e.printStackTrace(); 
	       } 
	   } 
}
