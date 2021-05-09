package com.galvanize;

public class LightSaber {
    private static final double EFFICIENCY = 10.0d;

    private double charge;

    private String color = "green";

    private int jediSerialNumber;

    public LightSaber(int serialNumber) {
        this(serialNumber, 100.0d);
    }

    public LightSaber(int serialNumber, double charge) {
        this.jediSerialNumber = serialNumber;
        this.charge = charge;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getJediSerialNumber() {
        return jediSerialNumber;
    }

    public void use(float minutes) {
        this.charge -= (minutes / 60) * EFFICIENCY;
    }

    public float getMinutesRemaining() {
        return (float)charge * 600.0f / 100.0f;
    }

    public void recharge() {
        this.charge = 100.0d;
    }
}
