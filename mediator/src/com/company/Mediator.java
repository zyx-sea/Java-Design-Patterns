package com.company;

/**
 * 抽象中介者<br>
 * create:2017-05-23 10:57
 *
 * @author zhou
 */
public abstract class Mediator {
    abstract void send(String message,Person person);
    abstract void SetA(Person A);
    abstract void SetB(Person B);
}
