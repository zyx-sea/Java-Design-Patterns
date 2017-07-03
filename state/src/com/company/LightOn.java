package com.company;

/**具体状态类
 * <br>
 * create:2017-06-08 10:57
 *
 * @author zhou
 */
public class LightOn implements LightState {

    @Override
    public void PressSwitch(Light light) {
        System.out.println("当前为开状态，将关闭电灯");
        light.setState(new LightOff());
    }
}
