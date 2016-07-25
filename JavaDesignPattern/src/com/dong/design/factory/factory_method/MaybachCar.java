package com.dong.design.factory.factory_method;

/****
 * 具体的产品
 * @author dong
 *
 */
public class MaybachCar implements Car {

    @Override
    public void driver() {
        System.out.println("正在开的是迈巴赫！");
    }

}
