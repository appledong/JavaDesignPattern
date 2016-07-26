package com.dong.design.factory.factory;

public class CarFactory_Benz implements CarFactory{

    @Override
    public Car creatCar() {
       
        return new BenzCar();
    }
    
    

}
