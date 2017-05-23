package com.company;

/**
 * <br>
 * create:2017-05-23 10:58
 *抽象同事类
 * @author zhou
 */
public abstract class Person {
    Mediator m_mediator;//中介
    abstract void setMediator(Mediator mediator);//设置中介
    abstract void SendMessage(String message);//设置中介发送信息
    abstract void GetMessage(String message);//从中介者获取信息
}
