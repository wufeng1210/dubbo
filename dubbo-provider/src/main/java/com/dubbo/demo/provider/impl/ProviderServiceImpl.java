package com.dubbo.demo.provider.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.dubbo.demo.provider.ProviderService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: dubbo
 * @description:
 * @author: wufeng
 * @create: 2018-10-21 18:08
 **/
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date() + "] Hello " + name
                + "; request from consumer : " + RpcContext.getContext().getLocalAddressString()));
        return "Hello " + name + ", response from provider: "+ RpcContext.getContext().getLocalAddressString();
    }
}
