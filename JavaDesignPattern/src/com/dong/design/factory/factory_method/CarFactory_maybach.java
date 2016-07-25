package com.dong.design.factory.factory_method;

public class CarFactory_maybach implements CarFactory{

    @Override
    public Car creatCar() {
       
        return new BmwCar();
    }
    
    

}
