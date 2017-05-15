package com.company;

/**
 * 抽象处理者<br>
 * create:2017-05-09 11:02
 *
 * @author zhou
 */
public abstract  class Handler {
    protected Handler successor=null;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    public abstract String handleFeeRequest(String user,double fee);
}
