package com.learn.java.optional;

import java.util.Optional;

public class Engine {
    Optional<VelocityMonitor> optionalVelocityMonitor;

    public Optional<VelocityMonitor> getOptionalVelocityMonitor() {
        return optionalVelocityMonitor;
    }

    public void setOptionalVelocityMonitor(Optional<VelocityMonitor> optionalVelocityMonitor) {
        this.optionalVelocityMonitor = optionalVelocityMonitor;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "optionalVelocityMonitor=" + optionalVelocityMonitor +
                '}';
    }
}
