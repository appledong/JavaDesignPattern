package com.dong.design.factory.factory_method;

/***
 * 介于用户和工厂之间的一个媒介，获取到
 *   用户的需求，然后去工厂提物品给用户。
 * 在本例中相当于是一个汽车的4s店。
 * @author dong
 *
 */
public class CarPackage {
    
    public Car buy(CarType carType){
        CarFactory carFactory = null;
        if(carType == CarType.audi){
            carFactory = new CarFactory_Audi();
            return carFactory.creatCar();
        } else if(carType == CarType.benz){
            carFactory = new CarFactory_Benz();
            return carFactory.creatCar();
        } else if(carType == CarType.bmw){
            carFactory = new CarFactory_Bmw();
            return carFactory.creatCar(); 
        }
        return null;
    }
}
