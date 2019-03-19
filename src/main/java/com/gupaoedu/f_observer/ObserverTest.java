package com.gupaoedu.f_observer;

public class ObserverTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("mic");
        Teacher t2 = new Teacher("tom");
        GPer.gPer.addObserver(t1);
        GPer.gPer.addObserver(t2);
        Question question = new Question();
        question.setName("xujj");
        question.setContext("观察者模式定义了对象一对多的关系，观察者对象监听主体对象，\n" +
                "一旦主体对象发生变化，观察者对象收到通知并更改。");
        GPer.gPer.publishQuestion(question);
    }
}
