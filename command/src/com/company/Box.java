package com.company;

/**
 * 发送者角色（开机命令角色）<br>
 * create:2017-05-11 11:08
 *
 * @author zhou
 */
public class Box {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void openButtonPressed(){
        //按下按钮执行操作
        command.execute();
    }
}
