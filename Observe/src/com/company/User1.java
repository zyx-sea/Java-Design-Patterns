package com.company;

/**
 * 具体观察者user1<br>
 * create:2017-06-01 10:59
 *
 * @author zhou
 */
public class User1 implements Observer{
    private  Subject subject;

    public User1(Subject subject) {
        this.subject = subject;
        subject.registerobserve(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("我收到了一条来自微信理财通的消息："+msg+"对我来说是条好消息！");
    }
}
