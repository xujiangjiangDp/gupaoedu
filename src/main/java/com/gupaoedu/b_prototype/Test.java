package com.gupaoedu.b_prototype;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Person person = new Person();
        Person person1 = (Person) person.clone();//浅克隆
        System.out.println(person);
        System.out.println(person1);
        System.out.println(person.getHobbies() == person1.getHobbies());

        Person person2 = (Person) person.deepClone();//深克隆
        System.out.println(person2);
        System.out.println(person.getHobbies() == person2.getHobbies());
    }
}
