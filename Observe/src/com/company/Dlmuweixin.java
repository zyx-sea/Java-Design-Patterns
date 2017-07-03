package com.company;

import java.util.ArrayList;

/**
 * 具体主题----大学微信订阅号<br>
 * create:2017-06-01 11:32
 *
 * @author zhou
 */
public class Dlmuweixin  implements Subject{
    private ArrayList<Observer> userList=new ArrayList<Observer>();
    private String msg,title;

    public String getTitle() {
        return title;
    }

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
    public void distributemsg(String msg ,String title){
        this.msg=msg;
        this.title=title;
        notifyobservers();
    }
}
