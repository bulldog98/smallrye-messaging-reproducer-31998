package de.bulldog98;

import jakarta.inject.Singleton;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@Singleton
public class Service2 {
    private final Emitter<Integer> dummy;

    public Service2(@Channel("service2") Emitter<Integer> dummy) {
        this.dummy = dummy;
    }
}
