package com.company;

/**
 * 具体聚合类<br>
 * create:2017-05-18 11:01
 *
 * @author zhou
 */
public class TCLTelevision implements Telvision {

    @Override
    public TVIterator createIterator() {
        return new TCLIterator();
    }
}
