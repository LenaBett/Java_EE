package com.heiwa.project.assignments;


public class WritingToolsDemo {


    public static void main(String[] args) {
        Pencil myPencil = new Pencil();
        WritingTool ballPen = new Ballpoint();
        WritingTool rollerPen = new Rollerball();
        Pen fountain = new FountainPen("Gold");

        myPencil.startWriting();
        myPencil.sharpen();
        ballPen.startWriting();
        rollerPen.info();
        fountain.refill();


    }

}

