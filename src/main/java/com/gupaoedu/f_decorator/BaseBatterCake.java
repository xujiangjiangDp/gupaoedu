package com.gupaoedu.f_decorator;

public class BaseBatterCake extends BatterCake {

    @Override
    public String getMsg() {
        return "1个煎饼";
    }

    @Override
    public int getPrice() {
        return 2;
    }
}
