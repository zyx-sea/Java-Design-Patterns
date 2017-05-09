package com.company;

/**
 * 代理角色类<br>
 * create:2017-05-02 10:53
 *
 * @author zhou
 */
public class TicketCenter {
    private BuyTicket buyTicket;
    public TicketCenter(BuyTicket buyTicket) {
        this.buyTicket = buyTicket;
    }
    public void showticket(){
        buyTicket.showticket();
    }
    public void buy(){
        System.out.println("通过代理购得：");
        showticket();
    }
}
