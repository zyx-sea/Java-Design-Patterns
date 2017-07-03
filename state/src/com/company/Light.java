package com.company;

/**
 * 上下文角色<br>
 * create:2017-06-08 10:55
 *
 * @author zhou
 */
public class Light {
    private LightState state;
    public Light(LightState state){
        this.state=state;
    }

    public LightState getState() {
        return state;
    }

    public void setState(LightState state) {
        this.state = state;
    }
    public void pressswitch(){
        state.PressSwitch(this);
    }
}
