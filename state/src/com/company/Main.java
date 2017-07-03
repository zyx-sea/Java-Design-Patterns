package com.company;

public class Main {

    public static void main(String[] args) {
	Light light=new Light(new LightOff());
	/*第一次按下开关，打开电灯*/
	light.pressswitch();
	/*等二次按下点灯，关闭电灯*/
	light.pressswitch();
    }
}
