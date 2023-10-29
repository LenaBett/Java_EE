package com.heiwa.project.assignments;

public class Ballpoint implements Pen {

    public Ballpoint() {
    }

    @Override
    public void refill() {
        System.out.println("Refill with an oil-based ink tube");
    }

    @Override
    public void info() {
        System.out.println("Ballpoint pens use an oil-based ink");
    }

    @Override
    public void startWriting() {
        System.out.println("You are writing with a ballpoint pen");
    }

    @Override
    public void stopWriting() {
        System.out.println("You have put your ballpoint pen down");
    }


}
