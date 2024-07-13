package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.c;
import com.ironsource.sdk.g.d;
import java.util.ArrayList;
import java.util.Iterator;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<Placement> f8789a;

    /* renamed from: b  reason: collision with root package name */
    public d f8790b;

    /* renamed from: c  reason: collision with root package name */
    public int f8791c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8792d;

    /* renamed from: e  reason: collision with root package name */
    public int f8793e;

    /* renamed from: f  reason: collision with root package name */
    public String f8794f;

    /* renamed from: g  reason: collision with root package name */
    public String f8795g;

    /* renamed from: h  reason: collision with root package name */
    public int f8796h;
    public int i;
    public int j;
    public Placement k;
    public c l;

    public o() {
        this.f8789a = new ArrayList<>();
        this.f8790b = new d();
    }

    public o(int i2, boolean z, int i3, int i4, int i5, d dVar, c cVar, int i6) {
        this.f8789a = new ArrayList<>();
        this.f8791c = i2;
        this.f8792d = z;
        this.f8793e = i3;
        this.f8796h = i4;
        this.f8790b = dVar;
        this.i = i5;
        this.l = cVar;
        this.j = i6;
    }

    public final Placement a() {
        Iterator<Placement> it = this.f8789a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.k;
    }
}
