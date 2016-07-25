package com.dong.design.factory.factory_simpleness;

public class CarFactory {
    
    /***
     * 简单工厂模式：
     *   适用于：客户需求不多，比较固定，数据量也不大，也是比较固定。
     * 创建一辆汽车
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
