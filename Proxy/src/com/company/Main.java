package com.company;

public class Main {
    public static void main(String[] args) {
	BuyTicket ticket=new Train();
	TicketCenter ticketCenter=new TicketCenter(ticket);
	ticketCenter.buy();
    }
}
