package com.gupaoedu.f_decorator;

public class BatterCakeDecoretor extends BatterCake {
    private BatterCake batterCake;
    public BatterCakeDecoretor(BatterCake batterCake){
        this.batterCake = batterCake;
    }

    @Override
    public String getMsg() {
        return batterCake.getMsg();
    }

    @Override
    public int getPrice() {
        return batterCake.getPrice();
    }
}
