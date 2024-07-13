package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.Set;

public class N5 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f4585a;

    /* renamed from: b  reason: collision with root package name */
    private Set<Integer> f4586b;

    /* renamed from: c  reason: collision with root package name */
    private int f4587c;

    /* renamed from: d  reason: collision with root package name */
    private int f4588d;

    public N5() {
        this(false, 0, 0, new HashSet());
    }

    public void a() {
        this.f4586b = new HashSet();
        this.f4588d = 0;
    }

    public Set<Integer> b() {
        return this.f4586b;
    }

    public int c() {
        return this.f4588d;
    }

    public int d() {
        return this.f4587c;
    }

    public boolean e() {
        return this.f4585a;
    }

    public N5(boolean z, int i, int i2, Set<Integer> set) {
        this.f4585a = z;
        this.f4586b = set;
        this.f4587c = i;
        this.f4588d = i2;
    }

    public void b(int i) {
        this.f4587c = i;
        this.f4588d = 0;
    }

    public void a(boolean z) {
        this.f4585a = z;
    }

    public void a(int i) {
        this.f4586b.add(Integer.valueOf(i));
        this.f4588d++;
    }
}
