package com.cswiki.rpc.sample.server;

import com.cswiki.rpc.sample.api.HelloService;
import com.cswiki.rpc.server.RpcService;

@RpcService(interfaceName = HelloService.class,serviceVersion = "helloServiceImpl3")
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return name + " Hello from " + "HelloServiceImpl1" ;
    }
}