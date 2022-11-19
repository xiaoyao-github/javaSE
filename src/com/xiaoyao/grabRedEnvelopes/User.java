package com.xiaoyao.grabRedEnvelopes;

/**
 * @author xiaoyao
 * @create 2022-11-13 22:12
 */
public class User {
    private String userName;
    private int balance;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public User(String userName, int balance) {
        this.userName = userName;
        this.balance = balance;
    }

    //成员方法
    public void show(){
        System.out.println("我是" + userName + ",我的余额是" + balance);
    }

}
