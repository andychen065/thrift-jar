include "test.thrift"

typedef test.Hotel Hotel

struct Hotels{
    1: optional Hotel hotel;
    2: optional list<string> rooms;
}

namespace java mythrift
enum HotelType {
   YILONG,
   JINJIANG=2
}

struct Hotel {
　　1:  optional i32 id;
　　2:  optional string hotelname;
　　3:  required HotelType HotelType.YILONG;
}

service QuerySrv{
　　/**
　　* 本方法实现根据名字和年龄来找到对应的用户信息
　　*/
　　UserDemo qryUser(1:string name, 2:i32 age);
 
　　/**
　　* 本方法实现根据id找到对应用户的手机号码
　　*/
　　string queryPhone(1:i32 id);
}