package com.my.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lixuelin on 17/9/22.
 */
public class MyHandler implements InvocationHandler {
    private ISubject iSubject;

    public MyHandler(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        method.invoke(iSubject, args);
        System.out.println("after");
        return null;
    }

    public static void main(String[] args) {
        MySubject mySubject = new MySubject();
        InvocationHandler h = new MyHandler(mySubject);
        Class<?> clazz = mySubject.getClass();
        ISubject is = (ISubject) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), h);
        is.doSth();
    }
}
