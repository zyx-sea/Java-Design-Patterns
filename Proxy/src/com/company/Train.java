package com.company;

/**
 * 具体主题类<br>
 * create:2017-05-02 10:51
 *
 * @author zhou
 */
public class Train implements BuyTicket {
    @Override
    public void showticket() {
        System.out.println("一张火车票");
    }
}
