package com.gp.bean;

public class Proxy implements ProxyTest{
    private ProxyTest proxyTest;

    public Proxy (ProxyTest proxyTest){
        this.proxyTest = proxyTest;
    }

    @Override
    public void save() {
        System.out.println("实际执行");
        proxyTest.save();
    }
}
