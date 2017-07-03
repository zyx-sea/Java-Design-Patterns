package com.company;

/**
 * 抽象迭代类<br>
 * create:2017-05-18 10:57
 *
 * @author zhou
 */
public interface TVIterator {
    void setChannel(int i);
    void next();
    void previous();
    boolean isLast();
    Object currentChannel();
    boolean isFirst();
}
