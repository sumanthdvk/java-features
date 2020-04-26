package com.learn.java.optional;

import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {
        VelocityMonitor velocityMonitor = null;
        Engine engine = new Engine();
        Spaceship spaceship = new Spaceship();
        engine.setOptionalVelocityMonitor(Optional.ofNullable(velocityMonitor));//ofNullabe else NPE
        spaceship.setOptionalEngine(Optional.of(engine));//use of() when we're pretty sure engine can never be null

        if (spaceship.getOptionalEngine().get().getOptionalVelocityMonitor().isPresent()) {
            System.out.println(spaceship.getOptionalEngine().get().getOptionalVelocityMonitor());
        }

        //or you can do the following instead of above if condition
        //this way null-checks with Optional are implicit and enforced by the type-system.
        spaceship.getOptionalEngine().ifPresent(System.out::println);

        //how to get the velocity meter speed?
        if (spaceship.getOptionalEngine().isPresent()) {
            Engine engine1 = spaceship.getOptionalEngine().get();
            if (engine1.getOptionalVelocityMonitor().isPresent()) {
                VelocityMonitor velocityMonitor1 = engine1.getOptionalVelocityMonitor().get();
                int speed = velocityMonitor1.getSpeed();
            }
        }

        //shorter way using flatMap
        //Using this kind of approach, no explicit checks are needed.
        //If any of the objects contain an empty Optional, the end result will also be an empty Optional.
        Optional<Integer> optionalSpeed = spaceship.getOptionalEngine()
                .flatMap(Engine::getOptionalVelocityMonitor)
                .map(VelocityMonitor::getSpeed);

        Engine engine1 = spaceship.getOptionalEngine().orElse(new Engine());
        //Engine engine2 = spaceship.getOptionalEngine().orElseGet(() -> new Engine());
        Engine engine2 = spaceship.getOptionalEngine().orElseGet(Engine::new);
        //if creating engines is a demanding operation then go for orElseGet



    }
}
