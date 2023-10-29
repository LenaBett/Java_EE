package com.heiwa.project.assignments;

public interface Pen extends WritingTool {

    public abstract void refill();

    @Override
    public void info();

    @Override
    public void startWriting();

    @Override
    public void stopWriting();



}
