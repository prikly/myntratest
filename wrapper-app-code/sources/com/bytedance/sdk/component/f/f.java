package com.bytedance.sdk.component.f;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: TTFutureTask */
public class f<V> extends FutureTask<V> implements Comparable<f<V>> {

    /* renamed from: a  reason: collision with root package name */
    private int f19232a;

    /* renamed from: b  reason: collision with root package name */
    private int f19233b;

    public f(Callable<V> callable, int i, int i2) {
        super(callable);
        this.f19232a = i == -1 ? 5 : i;
        this.f19233b = i2;
    }

    public f(Runnable runnable, V v, int i, int i2) {
        super(runnable, v);
        this.f19232a = i == -1 ? 5 : i;
        this.f19233b = i2;
    }

    /* renamed from: a */
    public int compareTo(f fVar) {
        if (a() < fVar.a()) {
            return 1;
        }
        return a() > fVar.a() ? -1 : 0;
    }

    public int a() {
        return this.f19232a;
    }
}
