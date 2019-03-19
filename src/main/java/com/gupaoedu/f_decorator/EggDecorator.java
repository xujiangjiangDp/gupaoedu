package com.gupaoedu.f_decorator;

public class EggDecorator extends BatterCakeDecoretor {

    public EggDecorator(BatterCake batterCake){
        super(batterCake);
    }

    @Override
    public String getMsg() {
        return super.getMsg()+"一个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+ 1;
    }
}
