package com.company;

/**
 * 具体策略类<br>
 * create:2017-06-13 10:54
 *
 * @author zhou
 */
public class StrategyA extends Strategy {

    @Override
    public void backDatabase() {
        System.out.println("策略A:逻辑备份");
    }
}
