package com.company;

/**
 * 具体子类<br>
 * create:2017-06-15 10:41
 *
 * @author zhou
 */
public class Deposit extends BankTemplateMethod {

    @Override
    public void transact() {
        System.out.println("存款");
    }
}
