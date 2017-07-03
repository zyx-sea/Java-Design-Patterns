package com.company;

/**
 * 动作解释器：终结符<br>
 * create:2017-05-16 11:15
 *
 * @author zhou
 */
public class ActionNode extends AbstractNode {

    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        if (action.equalsIgnoreCase("move")){
            return "移动";
        }else if (action.equalsIgnoreCase("run")){
            return "快速移动";
        }else{
            return "无效指令";
        }
    }
}
