package com.dong.design.factory.factory_method;

/***
 * 工厂简单方法模式
 *   适用于：用户需求比较固定，但是工厂数据量容易变的场景
 * @author dong
 *
 */
public interface CarFactory {
    public Car creatCar();
}
