package com.company;

import java.util.ArrayList;

/**
 * 具体主题——理财通<br>
 * create:2017-06-01 10:53
 *
 * @author zhou
 */
public class Financial implements Subject {

    private ArrayList<Observer> userList=new ArrayList<Observer>();
    private String msg;
    @Override
    public void registerobserve(Observer observer) {
        if (!userList.contains(observer)){
            userList.add(observer);
        }
    }

    @Override
    public void unregisterobserve(Observer observer) {
        if (userList.contains(observer)){
            userList.remove(observer);
        }

    }

    @Override
    public void notifyobservers() {
        for (Observer observer:userList){
            observer.update(msg);
        }
    }
    public void distributemsg(String s){
        this.msg=s;
        notifyobservers();
    }
}
