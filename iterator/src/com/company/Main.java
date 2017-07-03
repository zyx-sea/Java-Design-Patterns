package com.company;

public class Main {

    public static void display(Telvision tv){
        TVIterator iterator=tv.createIterator();
        System.out.println("电视频道：");
        while (!iterator.isLast()){
            System.out.println(iterator.currentChannel().toString());
            iterator.next();
        }
    }
    public static void reverseDisplay(Telvision tv){
        TVIterator iterator=tv.createIterator();
        iterator.setChannel(4);
        System.out.println("逆向遍历电视机频道：");
        while (!iterator.isFirst()){
            iterator.previous();
            System.out.println(iterator.currentChannel().toString());
        }
    }
    public static void main(String[] args) {
        Telvision tv;
        tv=new TCLTelevision();
        display(tv);
        System.out.println("-------------------------------------------");
        reverseDisplay(tv);
    }
}
