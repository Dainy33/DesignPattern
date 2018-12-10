package com.dainy33.ProtoType;

import java.io.Serializable;

public class Platelet implements Cloneable, Serializable {
    private int life;
    private String type;

    public Platelet(int life, String type) {
        this.life = life;
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
/**
 * @program: designpattern
 * @description:
 * @author: Dainy33
 * @create: 2018-12-06 16:41
 **/
