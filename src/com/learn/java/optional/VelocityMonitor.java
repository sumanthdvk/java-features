package com.learn.java.optional;

public class VelocityMonitor {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "VelocityMonitor{" +
                "speed=" + speed +
                '}';
    }
}
