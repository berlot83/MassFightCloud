package com.molokotech.model;

import java.util.ArrayList;

public class SpecialPower {

    /* Attributes of the class */
    private int id;                             /* Unique id */
    private String name;                        /* Name of the SpecialPower */
    private ArrayList<Integer> levels;          /* Levels asigned to it, in numbers, example 1, 2, 3, etc */
    private double power;                          /* Power of destruction or damage when hit */

    /* Empty constructor by default, because there isn't any other defined */

    /* Empty constructor, should be overrride mandatory later */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getLevels() {
        return levels;
    }

    public void setLevels(ArrayList<Integer> levels) {
        this.levels = levels;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
