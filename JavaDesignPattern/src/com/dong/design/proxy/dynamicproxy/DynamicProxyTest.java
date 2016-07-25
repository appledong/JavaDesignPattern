
package com.dong.design.proxy.dynamicproxy;


/*** 
 * @author: dzdonga 
 * 实现的主要功能: 动态代理功能和代理相同，具体详见静态代理
 * 2.对于被代理对象的多个行为的逻辑业务相同的时候，对于其每个行为都写一遍业务逻辑（静态代理）会造成代码臃肿，不美观。
 * 3.动态代理和静态代理实现原理不太一样，静态代理是利用接口对被代理对象的行为进行了包装，而动态代理是通过 反射机制对整个被代理
 * 对象进行包装。
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        ArtInterface artInterface = new Chunchun();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(artInterface);
        ArtInterface proxy = (ArtInterface) myInvocationHandler.getProxy();
        proxy.song();
        proxy.film();
    }

}
