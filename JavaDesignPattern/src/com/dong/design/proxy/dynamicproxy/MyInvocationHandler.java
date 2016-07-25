
package com.dong.design.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/***
 * @author: dzdonga 实现的主要功能: InvocationHandler: Each proxy instance has an
 *          associated invocation handler. When a method is invoked on a proxy
 *          instance, the method invocation is encoded and dispatched to the
 *          invoke method of its invocation handler
 */
public class MyInvocationHandler implements InvocationHandler {

    public Object target;

    public MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 由于此处逻辑完善是对整个对象的所有行为进行包装，所以有些数据可以在对象类中声明然后通过反射对其处理。
        System.out.println("春春唱歌需要5块钱");
        System.out.println("春春要唱歌了");
        Object result = method.invoke(target, args);
        System.out.println("春春唱完歌了");

        return result;
    }

    /***
     * @params说明参数含义
     * @return说明返回值含义
     * @throws IOException说明发生此异常的条件
     * @throws NullPointerException说明发生此异常的条件
     * java.lang.reflect.Proxy.newProxyInstance
     * (ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) 
     * throws IllegalArgumentException Returns an instance of a proxy class for the specified interfaces 
     * that dispatches method invocations to the specified invocation handler.（返回一个实现相同接口方法的某个对象的代理）
     * Thread.currentThread().getContextClassLoader():类的加载器用于加载反射的类
     * target.getClass().getInterfaces() 接口方法
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target
                .getClass().getInterfaces(), this);
    }
}
