package com.dainy33.ProtoType;

public class Cell implements Cloneable {

    private int life;

    private String type;

    private Platelet platelet;

    public Cell() {
    }

    public Cell(int life, String type, Platelet platelet) {
        this.life = life;
        this.type = type;
        this.platelet = platelet;
    }

    //shallow copy
    @Override
    protected Cell clone()  {
        Cell clone = null;
        try {
            clone = (Cell) super.clone();
            clone.platelet = (Platelet) platelet.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
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

    public Platelet getPlatelet() {
        return platelet;
    }

    public void setPlatelet(Platelet platelet) {
        this.platelet = platelet;
    }
}
/**
 * @program: designpattern
 * @description:
 * @author: Dainy33
 * @create: 2018-12-06 16:20
 **/
