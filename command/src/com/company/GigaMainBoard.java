package com.company;

/**
 * 接受者角色（主板实现类）<br>
 * create:2017-05-11 10:56
 *
 * @author zhou
 */
public class GigaMainBoard implements MainBoardApi {

    @Override
    public void open() {
        System.out.println("技嘉主板正在开机，请稍候。。。。。");
        System.out.println("接通电源。。。。。");
        System.out.println("设备检查。。。。。");
        System.out.println("装载系统。。。。。");
        System.out.println("机器正常运转起来。。。。。");
        System.out.println("机器已经正常打开，请操作");
    }
}
