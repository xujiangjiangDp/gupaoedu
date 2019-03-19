package com.gupaoedu.b_prototype;


import java.io.*;

public class Person implements Cloneable, Serializable {
    private String id;
    private String name;
    private Hobbies hobbies;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hobbies getHobbies() {
        return hobbies;
    }

    public void setHobbies(Hobbies hobbies) {
        this.hobbies = hobbies;
    }

    public Person(){
        this.hobbies = new Hobbies();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return  ois.readObject();
    }
}
