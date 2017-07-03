package com.company;


/**
 * 抽象主题接口<br>
 * create:2017-06-01 10:47
 *
 * @author zhou
 */
public interface Subject {
    void registerobserve(Observer observer);                            //用户订阅
    void unregisterobserve(Observer observer);                     //取消订阅
    void notifyobservers();                                                     //消息推送

}
