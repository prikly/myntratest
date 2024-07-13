package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.c;
import com.ironsource.sdk.g.d;
import java.util.ArrayList;
import java.util.Iterator;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<InterstitialPlacement> f8749a;

    /* renamed from: b  reason: collision with root package name */
    public d f8750b;

    /* renamed from: c  reason: collision with root package name */
    public int f8751c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8752d;

    /* renamed from: e  reason: collision with root package name */
    public int f8753e;

    /* renamed from: f  reason: collision with root package name */
    public int f8754f;

    /* renamed from: g  reason: collision with root package name */
    public String f8755g;

    /* renamed from: h  reason: collision with root package name */
    public String f8756h;
    public c i;
    public InterstitialPlacement j;

    public h() {
        this.f8749a = new ArrayList<>();
        this.f8750b = new d();
    }

    public h(int i2, boolean z, int i3, d dVar, c cVar, int i4) {
        this.f8749a = new ArrayList<>();
        this.f8751c = i2;
        this.f8752d = z;
        this.f8753e = i3;
        this.f8750b = dVar;
        this.i = cVar;
        this.f8754f = i4;
    }

    public final InterstitialPlacement a() {
        Iterator<InterstitialPlacement> it = this.f8749a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.j;
    }
}
