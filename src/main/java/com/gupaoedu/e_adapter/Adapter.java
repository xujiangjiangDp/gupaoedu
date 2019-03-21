package com.gupaoedu.e_adapter;

public class Adapter implements Iv5 {
    private V220 v220;

    public V220 getV220() {
        return v220;
    }

    public void setV220(V220 v220) {
        this.v220 = v220;
    }

    public Adapter(V220 v220) {
        this.v220 = v220;
    }

    @Override
    public void v5() {
        System.out.println("转换前是v5");
        System.out.println("变压器转换中………………");
        System.out.println("变压器转换后：");
        v220.v220();
    }

}
