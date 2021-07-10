package com.gp.bean;

public class Test1 {
    public static void main(String[] args) {
        ProxyTest proxyTest = new Proxy(new ProxyTestImpl());
        proxyTest.save();
    }
}
