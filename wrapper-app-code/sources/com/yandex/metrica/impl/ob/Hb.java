package com.yandex.metrica.impl.ob;

public class Hb implements Gb {

    /* renamed from: a  reason: collision with root package name */
    private final int f4103a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4104b;

    /* renamed from: c  reason: collision with root package name */
    private int f4105c = 0;

    public Hb(int i, int i2) {
        this.f4103a = i;
        this.f4104b = i2;
    }

    public int a() {
        return this.f4104b;
    }

    public boolean b() {
        int i = this.f4105c;
        this.f4105c = i + 1;
        return i < this.f4103a;
    }

    public void c() {
        this.f4105c = 0;
    }
}
