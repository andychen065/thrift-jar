struct User{
	1:i32 userId,
	2:string userName
}
service TestServ{
    string ping(1: string message),
	User getUser(1:i32 userId),
	string helloString(1: string name),
}