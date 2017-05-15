package com.company;

/**
 * 具体处理者<br>
 * create:2017-05-09 11:05
 *
 * @author zhou
 */
public class ProjectManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str="";
        //项目经理的权限
        if (fee<500) {
            if ("张三".equals(user)) {
                str = "成功：项目经理批准【" + user + "】的聚餐费用，金额为：" + fee + "元";
            } else {
                str = "失败：项目经理不批准【" + user + "】的聚餐费用，金额为：" + fee + "元";
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
