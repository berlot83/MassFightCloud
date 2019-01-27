package com.molokotech.model;

public class Stage {

    /* Attributes of the class */
    private int id;                         /* Unique id */
    private String name;                    /* Name of the Stage */

    /* Empty constructor by default, because there isn't any other defined */

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
}
