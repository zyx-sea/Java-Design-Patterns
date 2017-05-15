package com.company;

/**
 * 具体处理者<br>
 * create:2017-05-09 11:16
 *
 * @author zhou
 */
public class DeptManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str="";
        //部门经理的权限
        if (fee<1000){
            if("张三".equals(user)){
                str="成功：部门经理批准【"+user+"】的聚餐费用，金额为："+fee+"元";
            }else{
                str="失败：部门经理不批准【"+user+"】的聚餐费用，金额为："+fee+"元";
            }
        }else {
        //超过限额，继续传递给级别更高的人处理
        if (getSuccessor() != null) {
            return getSuccessor().handleFeeRequest(user, fee);
        }
    }
        return str;
    }
}

