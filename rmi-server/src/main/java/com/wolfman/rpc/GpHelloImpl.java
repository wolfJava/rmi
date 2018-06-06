package com.wolfman.rpc;

public class GpHelloImpl implements IGpHello {

    public String sayHello(String message) {
        return "Hello," + message;
    }

}
