package com.dong.design.factory.factory_abstract;


public class BmwCar implements Car {

    @Override
    public void driver() {
        System.out.println("正在开的是宝马车！");
    }

}
