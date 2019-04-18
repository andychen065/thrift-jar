import java.util.concurrent.TimeUnit;

import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.async.TAsyncClientManager;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TNonblockingSocket;
import org.apache.thrift.transport.TNonblockingTransport;

public class Client1 {
	public static void main(String[] args) throws Exception {
		// 异步调用管理器
		TAsyncClientManager clientManager = new TAsyncClientManager();
		// 客户端应该使用非阻塞 IO
		TNonblockingTransport transport = new TNonblockingSocket("localhost",10005);
		// 协议与服务端需要一致
		TProtocolFactory tProtocolFactory = new TBinaryProtocol.Factory();
		// 异步调用
		TestServ.AsyncClient asyncClient = new TestServ.AsyncClient(tProtocolFactory,clientManager,transport);
		asyncClient.getUser(123, new AsyncMethodCallback<User>() {
			// 处理服务返回的结果值
			public void onComplete(User user) {
				System.out.println(user);
			}

			// 处理调用服务过程中出现的异常
			public void onError(Exception e) {

			}
		});
		// 让线程等待一秒，以免主线程先于异步调用结果之前结束，导致结果未被输出
		TimeUnit.SECONDS.sleep(1);
	}
}
