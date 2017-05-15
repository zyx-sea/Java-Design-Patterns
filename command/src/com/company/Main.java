package com.company;
/*
客户测试类
* */
public class Main {

    public static void main(String[] args) {
	MainBoardApi mainBoardApi=new GigaMainBoard();
	OpenCommand openCommand=new OpenCommand(mainBoardApi);
	Box box=new Box();
	box.setCommand(openCommand);
	box.openButtonPressed();
    }
}
