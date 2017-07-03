package com.company;

/**
 * 具体策略<br>
 * create:2017-06-13 10:56
 *
 * @author zhou
 */
public class StrategyC extends Strategy {

    @Override
    public void backDatabase() {
        System.out.println("策略C：热备份");
    }
}
