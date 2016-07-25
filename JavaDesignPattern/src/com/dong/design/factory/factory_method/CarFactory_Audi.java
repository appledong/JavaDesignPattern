package com.dong.design.factory.factory_method;

public class CarFactory_Audi implements CarFactory{

    @Override
    public Car creatCar() {
       
        return new AudiCar();
    }
}
