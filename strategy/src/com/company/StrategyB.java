package com.company;

/**
 * 具体策略<br>
 * create:2017-06-13 10:55
 *
 * @author zhou
 */
public class StrategyB extends Strategy {

    @Override
    public void backDatabase() {
        System.out.println("策略B：冷备份");
    }
}
