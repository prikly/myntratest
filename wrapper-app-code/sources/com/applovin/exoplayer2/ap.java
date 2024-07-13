package com.applovin.exoplayer2;

import com.applovin.exoplayer2.h.z;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

final class ap extends a {

    /* renamed from: c  reason: collision with root package name */
    private final int f11131c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11132d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f11133e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f11134f;

    /* renamed from: g  reason: collision with root package name */
    private final ba[] f11135g;

    /* renamed from: h  reason: collision with root package name */
    private final Object[] f11136h;
    private final HashMap<Object, Integer> i = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ap(Collection<? extends ag> collection, z zVar) {
        super(false, zVar);
        int i2 = 0;
        int size = collection.size();
        this.f11133e = new int[size];
        this.f11134f = new int[size];
        this.f11135g = new ba[size];
        this.f11136h = new Object[size];
        int i3 = 0;
        int i4 = 0;
        for (ag agVar : collection) {
            this.f11135g[i4] = agVar.b();
            this.f11134f[i4] = i2;
            this.f11133e[i4] = i3;
            i2 += this.f11135g[i4].b();
            i3 += this.f11135g[i4].c();
            this.f11136h[i4] = agVar.a();
            this.i.put(this.f11136h[i4], Integer.valueOf(i4));
            i4++;
        }
        this.f11131c = i2;
        this.f11132d = i3;
    }

    /* access modifiers changed from: package-private */
    public List<ba> a() {
        return Arrays.asList(this.f11135g);
    }

    public int b() {
        return this.f11131c;
    }

    /* access modifiers changed from: protected */
    public int b(int i2) {
        return ai.a(this.f11133e, i2 + 1, false, false);
    }

    public int c() {
        return this.f11132d;
    }

    /* access modifiers changed from: protected */
    public int c(int i2) {
        return ai.a(this.f11134f, i2 + 1, false, false);
    }

    /* access modifiers changed from: protected */
    public int d(Object obj) {
        Integer num = this.i.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public ba d(int i2) {
        return this.f11135g[i2];
    }

    /* access modifiers changed from: protected */
    public int e(int i2) {
        return this.f11133e[i2];
    }

    /* access modifiers changed from: protected */
    public int f(int i2) {
        return this.f11134f[i2];
    }

    /* access modifiers changed from: protected */
    public Object g(int i2) {
        return this.f11136h[i2];
    }
}
