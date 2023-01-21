package com.tmdrn;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    private boolean isOn = false;
    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println(getClass().getSimpleName() + " myNumber: " + myNumber);
        System.out.println(getClass().getSimpleName() + " powerOn");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println(getClass().getSimpleName() + " dial " + phoneNumber);
    }

    @Override
    public void answer() {
        System.out.println(getClass().getSimpleName() + " answer");
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
