package com.company;

public class Main {

    public static void main(String[] args) {
	UserInfoDTO user=new UserInfoDTO();
	Caretaker caretaker=new Caretaker();

	user.setAccount("周一");
	user.setPassword("1111111");
	user.setTelNo("111111111111");
        System.out.println("状态一");
        user.show();
        caretaker.setMemeto(user.saveMemento());//保存备忘录
        System.out.println("-------------------------------------");

        user.setPassword("222222222");
        System.out.println("状态二");
        user.show();
        System.out.println("-------------------------------------");

        user.reatoreMemeto(caretaker.getMemeto());//从备忘录中恢复
        System.out.println("回到状态一");
        user.show();
    }
}
