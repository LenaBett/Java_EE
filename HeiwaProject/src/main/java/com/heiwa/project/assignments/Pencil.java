package com.heiwa.project.assignments;

public class Pencil implements WritingTool {

    protected String brand;

    public static void sharpen (){
        System.out.println("Your pencil is now sharp");
    }

    @Override
    public void info() {
        System.out.println("pencils use graphite as a writing material");
    }

    @Override
    public void startWriting() {
        System.out.println("You are writing with a pencil");
    }

    @Override
    public void stopWriting() {
        System.out.println("You have put your pencil down");
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
