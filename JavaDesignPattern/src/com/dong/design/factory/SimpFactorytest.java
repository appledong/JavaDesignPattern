package com.dong.design.factory;

import com.dong.design.factory.factory_abstract.CarType;
import com.dong.design.factory.factory_abstract.User;



public class SimpFactorytest {
    
    public static void main(String[] args) {
        User user = new User();
        user.driver(CarType.audi);
    }
}
