package edu.soft2.ioc.coffee;

import lombok.Data;

@Data
public class CoffeeMachine {
    private String color;//属性：String类型
    private CoffeeBean coffeeBean;//属性

    public void make(){
        System.out.println("我用"+getColor()+"色咖啡机，制作一杯"+getCoffeeBean().getFlavor());
    }
}
