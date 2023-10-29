package com.heiwa.project.assignments;

public class FountainPen implements Pen{

    private String nibMaterial;

    public FountainPen(String nibMaterial) {
        this.nibMaterial = nibMaterial;
    }

    @Override
    public void refill() {
        System.out.println("Refill the ink tube with an water-based ink from a bottle");
    }

    @Override
    public void info() {
        System.out.println("Fountain pens use a water-based ink");
    }

    @Override
    public void startWriting() {
        System.out.println("You are writing with a fountain pen");
    }

    @Override
    public void stopWriting() {
        System.out.println("You have put your fountain pen down");
    }

    public String getNibMaterial() {
        return nibMaterial;
    }

    public void setNibMaterial(String nibMaterial) {
        this.nibMaterial = nibMaterial;
    }
}
