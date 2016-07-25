package com.dong.design.factory.factory_method;

/****
 * 具体的产品
 * @author dong
 *
 */
public class AudiCar implements Car {

    @Override
    public void driver() {
        System.out.println("正在开的是奥迪车！");
    }

}
