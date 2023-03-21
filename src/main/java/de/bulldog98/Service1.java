package de.bulldog98;

import jakarta.inject.Singleton;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@Singleton
public class Service1 {
    private final Emitter<Integer> dummy;

    public Service1(@Channel("service1") Emitter<Integer> dummy) {
        this.dummy = dummy;
    }
}
