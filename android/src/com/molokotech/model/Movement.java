package com.molokotech.model;

public class Movement {

    /* Attributes of the class */
    private double forward;             /* Control -> */
    private double back;                /* Control <- */
    private double down;                /* Control down */
    private double up;                  /* Control up */
    private double jump;                /* Jump action */

    /* Empty contructor is predefined because there is no other constructor, need to create an interface mandatory */

    /* Set just set a value, and Get retrive this value */

    public double getForward() {
        return forward;
    }

    public void setForward(double forward) {
        this.forward = forward;
    }

    public double getBack() {
        return back;
    }

    public void setBack(double back) {
        this.back = back;
    }

    public double getDown() {
        return down;
    }

    public void setDown(double down) {
        this.down = down;
    }

    public double getUp() {
        return up;
    }

    public void setUp(double up) {
        this.up = up;
    }

    public double getJump() {
        return jump;
    }

    public void setJump(double jump) {
        this.jump = jump;
    }

}
