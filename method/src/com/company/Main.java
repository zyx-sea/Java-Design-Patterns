package com.company;

public class Main {

    public static void main(String[] args) {
	BankTemplateMethod bank;
	bank=new Transfer();
	bank.process();
	System.out.println("----------------------------");
	bank=new Withdraw();
	bank.process();
	System.out.println("----------------------------");
	bank=new Deposit();
	bank.process();

    }
}
