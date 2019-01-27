package com.molokotech.model;

public class Weapon {

    /* Attributes of the class */
    private int id;                     /* Unique id */
    private String name;                /* Weapon name */
    private double damagePower;         /* Damage number expressed, minus health */

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

    public double getDamagePower() {
        return damagePower;
    }

    public void setDamagePower(double damagePower) {
        this.damagePower = damagePower;
    }
}
