package com.tmdrn;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {

        System.out.println("powerOn");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("dial " + phoneNumber);
    }

    @Override
    public void answer() {
        System.out.println("answer");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber)
            return true;
        else
            return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
