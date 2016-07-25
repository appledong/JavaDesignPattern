
package com.dong.design.proxy.dynamicproxy;



/*** 
 * @author: dzdonga 
 * 实现的主要功能:被代理对象即春春
 */
public class Chunchun implements ArtInterface {

    @Override
    public void song() {
        System.out.println("春春要唱歌了...");
    }

    @Override
    public void film() {
        System.out.println("春春要拍电影了...");
    }

}
