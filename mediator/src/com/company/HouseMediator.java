package com.company;

/**
 * 具体中介者<br>
 * create:2017-05-23 11:03
 *
 * @author zhou
 */
public class HouseMediator extends Mediator {
    private Person m_A,m_B;
    @Override
    void send(String message, Person person) {
        if (person.equals(m_A)){
            m_B.GetMessage(message);//租房者给房东发消息
        }else {
            m_A.GetMessage(message);//房东收到消息
        }
    }

    @Override
    void SetA(Person A) {
        m_A=A;
    }

    @Override
    void SetB(Person B) {
        m_B=B;
    }
}
