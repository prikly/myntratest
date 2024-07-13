package com.yandex.metrica.impl.ob;

public class Sl extends Vl {

    /* renamed from: c  reason: collision with root package name */
    private static final Sl f4982c = new Sl("");

    public Sl(String str) {
        super(str);
    }

    public static Sl a() {
        return f4982c;
    }

    public String getTag() {
        return "AppMetricaInternal";
    }

    /* access modifiers changed from: protected */
    public boolean shouldLog() {
        super.shouldLog();
        return false;
    }

    private Sl() {
        this("");
    }
}
