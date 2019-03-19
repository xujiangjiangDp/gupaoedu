package com.gupaoedu.f_decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        BatterCake batterCake = new BaseBatterCake();
        System.out.println(batterCake.getMsg()+" "+batterCake.getPrice()+"元");

        batterCake = new EggDecorator(batterCake);
        System.out.println(batterCake.getMsg()+" "+batterCake.getPrice()+"元");

        batterCake = new HotdogDecoretor(batterCake);
        System.out.println(batterCake.getMsg()+" "+batterCake.getPrice()+"元");
    }
}
