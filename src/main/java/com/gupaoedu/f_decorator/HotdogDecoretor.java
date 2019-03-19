package com.gupaoedu.f_decorator;

public class HotdogDecoretor extends BatterCakeDecoretor {
    public HotdogDecoretor(BatterCake batterCake){
        super(batterCake);
    }
    @Override
    public String getMsg() {
        return super.getMsg()+"一个热狗";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}
