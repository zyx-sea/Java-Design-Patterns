package com.company;

/**
 * 具体同事类<br>
 * create:2017-05-23 11:06
 *
 * @author zhou
 */
public class Renter extends Person {


    @Override
    void setMediator(Mediator mediator) {
        m_mediator=mediator;
    }

    @Override
    void SendMessage(String message) {
        m_mediator.send(message,this);
    }

    @Override
    void GetMessage(String message) {
        System.out.println("租房者收到信息："+message);

    }
}
