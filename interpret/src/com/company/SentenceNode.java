package com.company;

/**
 * 简单句子解释：非终结符表达式<br>
 * create:2017-05-16 11:06
 *
 * @author zhou
 */
public class SentenceNode extends AbstractNode {
    private AbstractNode direction;
    private  AbstractNode action;
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    @Override
    public String interpret() {
        return direction.interpret()+action.interpret()+direction.interpret();
    }
}
