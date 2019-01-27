package com.molokotech.model;

public class Character {

    /* Attributes of the class */
    private int id;                             /* unique id */
    private String name;                        /* Name of the character */
    private SpecialPower specialPower;          /* SpecialPower assigned, optional */
    private Weapon weapon;                      /* Wrapon assigned, optional */
    private double health;                      /* Health */
    private int life;                           /* Quantity lifes */
    private int backpack;                       /* Quantity backpack load */

    /* Empty constructor, should be overrride mandatory later */
    public Character(){

    }

    /* Basic contructor */
    public Character(String name, SpecialPower specialPower, double health, int life){
        this.name = name;
        this.specialPower = specialPower;
        this.health = health;
        this.life = life;
    }

    /* Set just set a value, and Get retrive this value */

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

    public SpecialPower getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(SpecialPower specialPower) {
        this.specialPower = specialPower;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getBackpack() {
        return backpack;
    }

    public void setBackpack(int backpack) {
        this.backpack = backpack;
    }
}
