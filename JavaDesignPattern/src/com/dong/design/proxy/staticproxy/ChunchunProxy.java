
package com.dong.design.proxy.staticproxy;


/***
 * @author: dzdonga 实现的主要功能: 春春代理，代理及经纪人，肯定要有被代理对象的所有的功能。
 */
public class ChunchunProxy implements ArtInterface {

    private Chunchun chunchun;

    public ChunchunProxy() {
        super();
        this.chunchun = new Chunchun();
    }

    @Override
    public void song() {
        System.out.println("春春唱一首个需要5块钱");
        System.out.println("春春要唱歌了");
        chunchun.song();
        System.out.println("春春唱完歌了");
    }

}
