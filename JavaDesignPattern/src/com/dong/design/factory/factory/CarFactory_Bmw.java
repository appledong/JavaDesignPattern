package com.dong.design.factory.factory;

public class CarFactory_Bmw implements CarFactory{

    @Override
    public Car creatCar() {
       
        return new BmwCar();
    }
    
    

}
