// 包含头文件
// include “shared.thrift”        


// 指定目标语言
// namespace cpp tutorial
// namespace cpp com.example.project 
// namespace java com.example.project
namespace java com.javabloger.gen.code   # 注释1   定义生成代码的命名空间，与你需要定义的package相对应。

struct Blog {   #  注释2.1   定义实体名称和数据结构，类似你业务逻辑中的pojo get/set
	1: string topic     #  注释2.2  参数类型可以参见 Thrift wiki   
	2: binary content  
	3: i64    createdTime
	4: string id
	5: string ipAddress
	6: map<string,string> props
}

enum TweetType { 
	TWEET,         // 编译器默认从1开始赋值
	RETWEET = 2,  // 可以赋予某个常量某个整数
	DM = 0xa,     //允许常量是十六进制整数
	REPLY         // 末尾没有逗号
} 

// 定义变量
// const i32 INT32CONSTANT = 9853

const i32 INT_CONST = 1234;    // 分号是可选的
const map<string,string> MAP_CONST = {"hello": "world", "goodnight": "moon"}

typedef i32 MyInteger 

exception TwitterUnavailable {
    1: string message;
}

service ThriftCase {  #  注释3    代码生成的类名，你的业务逻辑代码需要实现代码生成的ThriftCase.Iface接口
	i32 testCase1(1:i32 num1, 2:i32 num2, 3:string  num3), #注释4.1 方法名称和方法中的入参，入参类型参见wiki
	list<string> testCase2(1:map<string,string>  num1),
	void testCase3(),
	void testCase4(1:list<Blog> blog),   #  注释4.2   list 是thrift中基本数据类型中的一种，list中包含的Blog对象是上面struct中定义的
	list<Blog> getBlogs(),
	void loginTwiiter(1:string  id) throws (1:TwitterUnavailable unavailable),
}