package com.dong.design.factory.factory_method;

public class CarFactory_Bmw implements CarFactory{

    @Override
    public Car creatCar() {
       
        return new BmwCar();
    }
    
    

}
