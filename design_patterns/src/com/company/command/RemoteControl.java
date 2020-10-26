package com.company.command;

/**
 * @Author: Shi Shuaike
 * @Date: 2020/10/19 14:50
 * @Description:相当于服务员
 */
public class RemoteControl {
    Command command = null;

    public void setCommand(Command command){
        this.command = command;
    }

    public void buttonPressed(){
        command.execute();
    }
}
