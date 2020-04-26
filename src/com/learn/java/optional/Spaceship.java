package com.learn.java.optional;

import java.util.Optional;

public class Spaceship {
    private Optional<Engine> optionalEngine;

    public Optional<Engine> getOptionalEngine() {
        return optionalEngine;
    }

    public void setOptionalEngine(Optional<Engine> optionalEngine) {
        this.optionalEngine = optionalEngine;
    }
}
