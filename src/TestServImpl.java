import org.apache.thrift.TException;

public class TestServImpl implements TestServ.Iface {

	@Override
	public String ping(String message) throws TException {
		return "ping";
	}

	@Override
	public User getUser(int userId) throws TException {
		User user = new User();
		user.setUserId(1111);
		user.setUserName("Andy");
		return user;
	}

	@Override
	public String helloString(String name) throws TException {
		return "Hello " + name;
	}

}
