package service.demo;

import org.apache.thrift.async.AsyncMethodCallback; 

public class MethodCallback implements AsyncMethodCallback { 
	Object response = null; 

	public Object getResult() { 
		// 返回结果值
		return this.response; 
	} 

	// 处理服务返回的结果值
	@Override 
	public void onComplete(Object response) { 
		this.response = response; 
	} 
	// 处理调用服务过程中出现的异常

	@Override
	public void onError(Exception exception) {
		exception.printStackTrace();
	} 
}