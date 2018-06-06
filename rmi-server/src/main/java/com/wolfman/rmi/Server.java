package com.wolfman.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String[] args) {

        try {
            //注意：客户端和服务端的接口报名需一致，要不会报错。
            IHelloService helloService = new HelloServiceImpl();//已经发布了一个远程对象
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://127.0.0.1/Hello",helloService);//注册中心 key - value
            System.out.println("服务启动成功");

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }

}
