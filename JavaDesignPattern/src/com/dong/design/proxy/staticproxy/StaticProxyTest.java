
package com.dong.design.proxy.staticproxy;


/*****
 * @author: dzdonga
 *  实现的主要功能: 静态代理：常用的场景：对于一个对象来说，他的行为
 *          只需要处理核心业务而与其核心业务没有关系的逻辑业务则可以交给他的代理来做。
 *   使用代理的优点是：1. 当前对象可以专心处理自己的核心逻辑
 *   2.和核心逻辑无关的业务逻辑有修改后，无需对当前对象操作
 *   3. 外面不会和当前对象接触，对对象起到保护作用，对象代码可以混淆。  
 *   4. 下面是以明星（春春）及其经纪人为例描述静态代理的用法。      
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        ArtInterface artInterface = new ChunchunProxy();
        artInterface.song();
    }

}
