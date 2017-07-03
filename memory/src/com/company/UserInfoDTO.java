package com.company;

/**
 * 原生器<br>
 * create:2017-05-25 10:57
 *
 * @author zhou
 */
public class UserInfoDTO {
    private  String account;
    private  String password;
    private String telNo;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
    public Memeto saveMemento(){
        return new Memeto(account,password,telNo);
    }
    public  void reatoreMemeto(Memeto memeto){
        this.account=memeto.getAccount();
        this.password=memeto.getPassword();
        this.telNo=memeto.getTelNo();
    }
    public void show(){
        System.out.println("Account:"+this.account);
        System.out.println("Password:"+this.password);
        System.out.println("TelNo："+this.telNo);
    }
}
