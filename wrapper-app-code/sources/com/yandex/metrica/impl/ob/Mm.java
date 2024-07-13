package com.yandex.metrica.impl.ob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class Mm implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicInteger f4577b = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    private final String f4578a;

    public Mm(String str) {
        this.f4578a = str;
    }

    private String a() {
        String str = this.f4578a;
        return str + "-" + f4577b.incrementAndGet();
    }

    public static int c() {
        return f4577b.incrementAndGet();
    }

    public Km b() {
        return new Km(a());
    }

    public Thread newThread(Runnable runnable) {
        return new Lm(runnable, a());
    }

    public static Lm a(String str, Runnable runnable) {
        return new Lm(runnable, new Mm(str).a());
    }
}
