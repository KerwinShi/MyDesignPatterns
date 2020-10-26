package com.company.command;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 14:46
 * @Description:相当于订单
 */
public class LightOnCommand implements Command{
    Light light = null;

    public LightOnCommand(Light light){
        this.light =light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
