package com.ironsource.sdk.controller;

import java.util.ArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private int f9103a = a.f9106a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList f9104b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private String f9105c;

    enum a {
        ;
        

        /* renamed from: a  reason: collision with root package name */
        public static final int f9106a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f9107b = 2;

        static {
            f9108c = new int[]{1, 2};
        }
    }

    public b(String str) {
        this.f9105c = str;
    }

    public final synchronized void a() {
        this.f9103a = a.f9107b;
    }

    public final synchronized void a(Runnable runnable) {
        if (this.f9103a != a.f9107b) {
            this.f9104b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public final synchronized void b() {
        Object[] array = this.f9104b.toArray();
        for (int i = 0; i < array.length; i++) {
            ((Runnable) array[i]).run();
            array[i] = null;
        }
        this.f9104b.clear();
    }
}
