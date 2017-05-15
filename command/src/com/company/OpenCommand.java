package com.company;

/**
 * 具体命令角色<br>
 * create:2017-05-11 11:02
 *
 * @author zhou
 */
public class OpenCommand implements Command {
    /*持有真正实现命令的接受者*---主板对象*/
    private MainBoardApi mainBoardApi=null;
    /*构造方法，传入主板对象*/

    public OpenCommand(MainBoardApi mainBoardApi) {
        this.mainBoardApi = mainBoardApi;
    }

    @Override
    public void execute() {
        /*执行开机操作*/
        this.mainBoardApi.open();
    }
}
