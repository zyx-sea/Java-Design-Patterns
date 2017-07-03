package com.company;

/**
 * 抽象类<br>
 * create:2017-06-15 10:38
 *
 * @author zhou
 */
public abstract class BankTemplateMethod {
    public void takeNumber(){
        System.out.println("取号排队");
    }
    public abstract void transact();
    public void evaluate(){
        System.out.println("反馈评分");
    }
    public void process(){
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
