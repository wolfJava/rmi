package com.wolfman.rpc;

import com.wolfman.rpc.annotation.RpcAnnotation;

@RpcAnnotation(IGpHello.class)
public class GpHelloImpl implements IGpHello {

    public String sayHello(String message) {
        return "Hello," + message;
    }

}
