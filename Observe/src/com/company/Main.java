/*
* 客户测试类
* */
package com.company;

public class Main {

    public static void main(String[] args) {
	Financial financial=new Financial();
	User1 y=new User1(financial);
	User2 x=new User2(financial);
	financial.distributemsg("理财通收益率全线突破5%");

		System.out.println("_______________________________________________");

		Dlmuweixin dlmuweixin=new Dlmuweixin();
		User1 h1=new User1(dlmuweixin);
		dlmuweixin.distributemsg("这是一条关于海事大学微信订阅号的信息","专业设置。。。。。。");
	}
}
