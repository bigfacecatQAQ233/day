package com.gp.bean;

public class ProxyTestImpl implements ProxyTest{
    @Override
    public void save() {
        System.out.println("接口的实现类中重写的方法");
    }
}
