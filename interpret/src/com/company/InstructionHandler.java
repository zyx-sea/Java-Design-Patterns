package com.company;

import java.util.Stack;

/**
 * 指令处理类：“工具类<br>
 * create:2017-05-16 11:20
 *
 * @author zhou
 */
public class InstructionHandler {
    private String instruction;
    private AbstractNode node;
    public void handle(String instruction){
        AbstractNode left=null,right=null;
        AbstractNode direction=null,action=null,distance=null;
        Stack stack=new Stack();
        String[] words=instruction.split(" ");//以空格分割字符串
        for(int i=0;i<words.length;i++) {
            if (words[i].equalsIgnoreCase("and")) {
                left = (AbstractNode) stack.pop();
                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DirectionNode(word3);
                right = new SentenceNode(direction, action, distance);
                stack.push(new AndNode(left, right));
            } else {
                String word1=words[i];
                direction=new DirectionNode(word1);
                String word2=words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DirectionNode(word3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }
        }
        this.node=(AbstractNode)stack.pop();
    }
    public String output(){
        String result=node.interpret();
        return result;
    }
}
