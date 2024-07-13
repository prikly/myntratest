package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.Component;

public class HeartBeatConsumerComponent {
    public static Component<?> create() {
        return Component.intoSet(new HeartBeatConsumer() {
        }, HeartBeatConsumer.class);
    }
}
