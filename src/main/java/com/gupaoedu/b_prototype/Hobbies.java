package com.gupaoedu.b_prototype;

import java.io.Serializable;

public class Hobbies implements Serializable {
    public String football;

    public String backetball;

    public String getFootball() {
        return football;
    }

    public void setFootball(String football) {
        this.football = football;
    }

    public String getBacketball() {
        return backetball;
    }

    public void setBacketball(String backetball) {
        this.backetball = backetball;
    }
}
