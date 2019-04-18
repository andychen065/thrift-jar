import org.apache.thrift.async.AsyncMethodCallback;


public class MyCallback implements AsyncMethodCallback<java.lang.String> {  

	// 返回结果  
	@Override  
	public void onComplete(java.lang.String response) {  
		System.out.println("onComplete");  
		System.out.println(response);  
	}  

	// 返回异常  
	@Override  
	public void onError(Exception exception) {  
		System.out.println("onError");  
	}

}  
