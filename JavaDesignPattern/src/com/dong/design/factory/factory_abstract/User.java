package com.dong.design.factory.factory_abstract;



/****
 * 买家
 * @author dong
 *
 */
public class User {
    
   public Car buyCar(CarType carType){
       CarFactory carFactory = new CarFactory();
       return carFactory.creatCar(carType);
   }
    
   public void driver(CarType carType){
       Car car = buyCar(carType);
       car.driver();
   }
}
