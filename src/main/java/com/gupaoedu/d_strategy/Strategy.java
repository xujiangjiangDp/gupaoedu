package com.gupaoedu.d_strategy;

public class Strategy {
    private IActive iActive;

    public Strategy(IActive iActive) {
        this.iActive = iActive;
    }

    public void execute(){
        iActive.doActive();
    }
}
