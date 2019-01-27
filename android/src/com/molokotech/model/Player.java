package com.molokotech.model;

import java.util.ArrayList;

public class Player {

    /* Attributes of the class */
    private int id;                                 /* Unique id */
    private int age;                                /* age of the player */
    private String name;                            /* Name of the player */
    private String password;                        /* Password of the player */
    private String email;                           /* Email declared */
    private String country;                         /* Country were is playing for */
    private Character character;                    /* Character as object, optional because could be waiting for play */
    private long coins;                             /* Number of coin earned for every player */
    private double credit;                          /* Real money in his wallet, previusly paid */
    private String team;                            /* Multiplayer team exist, this could be added to */

    /* Empty constructor, should be overrride mandatory later */
    public Player(){

    }

    /* Basic constructor */
    public Player(String name, String password){
        this.name = name;
        this.password = password;
    }

    /* Set just set a value, and Get retrive this value */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public long getCoins() {
        return coins;
    }

    public void setCoins(long coins) {
        this.coins = coins;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
