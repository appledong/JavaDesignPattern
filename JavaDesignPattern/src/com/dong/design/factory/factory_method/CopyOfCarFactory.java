package com.dong.design.factory.factory_method;

public class CopyOfCarFactory {
    
    /***
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
