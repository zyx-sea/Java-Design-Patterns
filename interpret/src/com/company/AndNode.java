package com.company;

/**
 * And解释：非终结符表达式<br>
 * create:2017-05-16 11:03
 *
 * @author zhou
 */
public class AndNode extends AbstractNode {

    private  AbstractNode left;
    private AbstractNode  right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public String interpret() {
        return left.interpret()+"再"+right.interpret();
    }
}
