package com.xiaoyao.grabRedEnvelopes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoyao
 * @create 2022-11-13 22:29
 */
public class QunZhu extends User{


    public QunZhu(String userName, int balance) {
        super(userName, balance);
    }

    public List<Integer> faHongBao(Integer amountOfMoney, Integer count){
        //先比较要要发的红包金额是否超过余额
        Integer balance = getBalance();
        System.out.println(balance);

        if (amountOfMoney > balance){
            return null;
        }
        //钱足够，可以进行发红包
        List<Integer> hongBaoList = new ArrayList<>();
        //对要要发的红包取平均数，剩余的钱放入到最后一个红包当中
        int left = amountOfMoney%count;
        int average = amountOfMoney/count;
        for (Integer i = 0; i < count-1; i++) {
            hongBaoList.add(average);
        }
        //最后一个红包
        hongBaoList.add(average+left);
        //群主余额减少
        setBalance(balance-amountOfMoney);
        return hongBaoList;
    }
}
