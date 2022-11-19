package com.xiaoyao.grabRedEnvelopes;

import java.util.List;
import java.util.Random;

/**
 * @author xiaoyao
 * 一个发红包抢红包的案例
 * 1.定义一个实体类 user 属性name ,leftMoney,提供get,set方法,空参构造和有参构造
 * 2.定义一个类继承user 定义空参构造和有参构造方法
 * 3.定义发红包的方法
 *     1.判断余额是不是够发红包
 *     2.平均分配,除不尽的放入最后一个红包
 *     3修改群主余额;
 * @create 2022-11-13 22:09
 */
public class GrabRedEnvelopes {

    public static void main(String[] args) {
        //群主
        QunZhu qunZhu = new QunZhu("群主", 100);
        //群员
        QunYuan qunYuan1 = new QunYuan("群员1", 11);
        QunYuan qunYuan2 = new QunYuan("群员2", 21);
        QunYuan qunYuan3 = new QunYuan("群员3", 23);

        List<Integer> faDeHongBao = qunZhu.faHongBao(10,3);

        //群员去抢红包,根据随机获取的list的索引
        qunYuan1.qiangHongBao(faDeHongBao);
        qunYuan2.qiangHongBao(faDeHongBao);
        qunYuan3.qiangHongBao(faDeHongBao);
        //展示抢完红包后所有人的余额
        qunZhu.show();
        qunYuan1.show();
        qunYuan2.show();
        qunYuan3.show();

    }


}
