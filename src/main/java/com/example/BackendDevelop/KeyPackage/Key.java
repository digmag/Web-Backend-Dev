package com.example.BackendDevelop.KeyPackage;

public class Key {

    public Key(int office){
        this.office = office;
        isBooked = false;
    }
    private final int office;
    private boolean isBooked;

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public int getOffice() {
        return office;
    }
}
