package com.heiwa.project.assignments;

public class Rollerball implements Pen{

    public Rollerball() {
    }
    @Override
    public void refill() {
        System.out.println("Refill with a water-based ink canister");
    }


    @Override
    public void info() {
        System.out.println("Rollerball pens use an water-based ink");
    }

    @Override
    public void startWriting() {
        System.out.println("You are writing with a rollerball pen");
    }

    @Override
    public void stopWriting() {
        System.out.println("You have put your rollerball pen down");
    }
}
