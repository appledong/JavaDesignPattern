package com.dong.design.factory.factory_abstract;


public class CarFactory {
    
    /***
     * 抽象工厂方法模式
     *   适用于：
     *     1. 客户需求常变的情况。
     * @return
     */
    public Car creatCar(CarType carType){
        if(carType == CarType.audi){
            return new AudiCar();
        } else if(carType == CarType.benz){
            return new BenzCar();
        } else if(carType == CarType.bmw){
            return new BmwCar();
        }
        return new BmwCar();
    }

}
