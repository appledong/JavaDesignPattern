package com.dong.design.factory.factory_method;

public class BenzCar implements Car {

    @Override
    public void driver() {
        System.out.println("正在开的是奔驰车！");
    }

}
