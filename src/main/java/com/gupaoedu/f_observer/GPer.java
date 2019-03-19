package com.gupaoedu.f_observer;

import java.util.Observable;

public class GPer extends Observable {
    public static  final  GPer gPer = new GPer();

    public void publishQuestion(Question question){
        System.out.println(question.getName()+" 发表了一个问题 "+question.getContext());
        setChanged();//标记被观察者发生变化
        notifyObservers(question);
    }
}
