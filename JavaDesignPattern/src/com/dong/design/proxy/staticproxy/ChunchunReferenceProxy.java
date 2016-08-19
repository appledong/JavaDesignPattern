
package com.dong.design.proxy.staticproxy;


/***
 * @author: dzdonga 
 * 引用代理的代理对象：持有春春对象并代理了唱歌的行为
 * 		1. 处理春春的唱歌行为
 * 		2. 处理出场费和善后等行为
 */
public class ChunchunReferenceProxy implements ReferenceInterface {

    private Chunchun chunchun;

    public ChunchunReferenceProxy() {
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
