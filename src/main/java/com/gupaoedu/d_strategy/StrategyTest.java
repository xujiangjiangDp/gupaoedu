package com.gupaoedu.d_strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Strategy strategy1 = new Strategy(new ActiveA());
        strategy1.execute();
        Strategy strategy2 = new Strategy(new ActiveB());
        strategy2.execute();
        Strategy strategy3 = new Strategy(new ActiveC());
        strategy3.execute();
    }
}
