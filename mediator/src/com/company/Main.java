package com.company;

public class Main {

    public static void main(String[] args) {
	Mediator mediator=new HouseMediator();
	Person p1=new Renter();
	Person p2=new Landlord();
	mediator.SetA(p1);
	mediator.SetB(p2);
	p1.setMediator(mediator);
	p2.setMediator(mediator);
	p1.SendMessage("我想在南京路附近租一套房子，价格800元一个月");
	p2.SendMessage("出租房子：南京路250号，70平方米，1000元一个月");
    }
}
