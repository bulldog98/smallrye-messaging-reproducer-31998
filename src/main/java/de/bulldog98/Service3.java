package de.bulldog98;

import jakarta.inject.Singleton;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@Singleton
public class Service3 {
    private final Emitter<Integer> dummy;

    public Service3(@Channel("service3") Emitter<Integer> dummy) {
        this.dummy = dummy;
    }
}
