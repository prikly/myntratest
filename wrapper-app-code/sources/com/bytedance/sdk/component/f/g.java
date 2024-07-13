package com.bytedance.sdk.component.f;

import java.util.UUID;

/* compiled from: TTRunnable */
public abstract class g implements Comparable<g>, Runnable {

    /* renamed from: a  reason: collision with root package name */
    private int f19234a;

    /* renamed from: b  reason: collision with root package name */
    private String f19235b;

    /* renamed from: c  reason: collision with root package name */
    private String f19236c;

    public g(String str, int i) {
        this.f19234a = 0;
        this.f19234a = i == 0 ? 5 : i;
        this.f19235b = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());
        this.f19236c = str;
    }

    public g(String str) {
        this.f19234a = 0;
        this.f19234a = 5;
        this.f19235b = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());
        this.f19236c = str;
    }

    public void a(int i) {
        this.f19234a = i;
    }

    public int a() {
        return this.f19234a;
    }

    /* renamed from: a */
    public int compareTo(g gVar) {
        if (a() < gVar.a()) {
            return 1;
        }
        return a() >= gVar.a() ? -1 : 0;
    }

    public String b() {
        return this.f19236c;
    }
}
