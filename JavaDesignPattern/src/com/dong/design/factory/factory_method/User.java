package com.dong.design.factory.factory_method;

/****
 * 买家
 * @author dong
 *
 */
public class User {
    
   public Car buyCar(CarType carType){
       CarPackage carPackage = new CarPackage();
       Car car = carPackage.buy(carType);
    return car;
   }
    
   public void driver(CarType carType){
       Car car = buyCar(carType);
       car.driver();
   }
}
