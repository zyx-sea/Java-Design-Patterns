package com.company;

/**
 * 具体处理者<br>
 * create:2017-05-09 11:18
 *
 * @author zhou
 */
public class GeneralManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str="";
        //总经理的权限
        if (fee>=1000) {
            if ("张三".equals(user)) {
                str = "成功：总经理批准【" + user + "】的聚餐费用，金额为：" + fee + "元";
            } else {
                str = "失败：总经理不批准【" + user + "】的聚餐费用，金额为：" + fee + "元";
            }
        }else{
            //如果有后继的处理对象，继续传递
            if(getSuccessor()!=null){
                return getSuccessor().handleFeeRequest(user,fee);
            }
        }
        return str;
    }
}

