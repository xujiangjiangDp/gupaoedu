package com.gupaoedu.c_proxy.JDKProxy;

public class JDKProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new JDKMeiPo().getInstance(new Sun());
        person.findLove();
    }
}
