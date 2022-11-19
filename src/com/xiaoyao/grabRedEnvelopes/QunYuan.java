package com.xiaoyao.grabRedEnvelopes;

import java.util.List;
import java.util.Random;

/**
 * @author xiaoyao
 * @create 2022-11-13 22:36
 */
public class QunYuan extends User{

    public QunYuan(String userName, int balance) {
        super(userName, balance);
    }


    public void qiangHongBao(List<Integer> faDeHongBao) {

        //随机获取list的索引
        Random random = new Random();
        int i = random.nextInt(faDeHongBao.size());
        int value = faDeHongBao.get(i);
        faDeHongBao.remove(i);
        //最后余额
        setBalance(getBalance()+value);

    }
}
