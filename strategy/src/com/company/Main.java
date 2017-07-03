package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("尝试策略A");
        DBContext dbContext=new DBContext(new StrategyA());
        dbContext.executeBackupDatabase();
        System.out.println("------------------------------");
        System.out.println("尝试策略A");
         dbContext=new DBContext(new StrategyB());
        dbContext.executeBackupDatabase();
        System.out.println("------------------------------");
        System.out.println("尝试策略A");
        dbContext=new DBContext(new StrategyC());
        dbContext.executeBackupDatabase();
    }
}
