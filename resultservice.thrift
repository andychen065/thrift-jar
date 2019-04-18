namespace java wu.thrift.service

include "result.thrift"

typedef result.TResult TResult

service TResultService{
    TResult getResponse(1:string code);
}