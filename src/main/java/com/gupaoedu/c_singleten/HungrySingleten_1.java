package com.gupaoedu.c_singleten;

public class HungrySingleten_1 {

    //类加载时直接初始化
    private static final HungrySingleten_1 hungrySingleten = new HungrySingleten_1();

    //私有构造
    private HungrySingleten_1(){}

    public HungrySingleten_1 getInstance(){
        return hungrySingleten;
    }

}
