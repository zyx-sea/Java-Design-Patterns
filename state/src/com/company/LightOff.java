package com.company;

/**
 * 具体状态类<br>
 * create:2017-06-08 10:53
 *
 * @author zhou
 */
public class LightOff implements LightState {

    @Override
    public void PressSwitch(Light light) {
        System.out.println("当前为关状态，将打开电灯！！");
        light.setState(new LightOn());
    }
}
