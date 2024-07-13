package com.yandex.metrica.impl.ob;

import java.util.Map;

public class Mn implements Kn<String> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, ?> f4579a;

    public Mn(Map<String, ?> map) {
        this.f4579a = map;
    }

    public In a(Object obj) {
        String str = (String) obj;
        if (!this.f4579a.containsKey(str)) {
            return In.a(this);
        }
        return In.a(this, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", new Object[]{str}));
    }
}
