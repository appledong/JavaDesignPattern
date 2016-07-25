
package com.dong.design.proxy.staticproxy;



/*** 
 * @author: dzdonga 
 * 实现的主要功能:被代理对象即春春
 */
public class Chunchun implements ArtInterface {

    @Override
    public void song() {
        System.out.println("春春要唱歌了...");
    }

}
