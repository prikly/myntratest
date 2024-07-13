package com.google.firebase.components;

import java.util.List;

public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor NOOP = $$Lambda$Tn54AvUXpYlCSk1dOxSKa5bJFpM.INSTANCE;

    List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar);
}
