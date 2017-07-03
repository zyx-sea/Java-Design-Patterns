package com.company;

/**
 * 距离解释：终结符表达式<br>
 * create:2017-05-16 11:18
 *
 * @author zhou
 */
public class DistanceNode extends AbstractNode{
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }
    @Override
    public String interpret() {
        return this.distance;
    }
}
