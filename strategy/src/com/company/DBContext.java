package com.company;

/**
 * 环境类<br>
 * create:2017-06-13 10:52
 *
 * @author zhou
 */
public class DBContext {
    public Strategy strategy;

    public DBContext(Strategy strategy) {
        this.strategy = strategy;
    }
    public void executeBackupDatabase(){
        strategy.backDatabase();
    }
}
