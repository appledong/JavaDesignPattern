package com.dong.design.factory.factory_method;

public class CarFactory_Benz implements CarFactory{

    @Override
    public Car creatCar() {
       
        return new BenzCar();
    }
    
    

}
