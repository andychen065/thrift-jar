import org.apache.thrift.TException;

public class HelloWorldImpl implements HelloWorldService.Iface{

	@Override
	public String sayHello(String username) throws TException {
		return "Hi " + username + ", welcome to thrift";
	}

	@Override
	public String getRandom() throws TException {
		return "random";
	}

}
