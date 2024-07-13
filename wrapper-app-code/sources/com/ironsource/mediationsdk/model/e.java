package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.c;
import com.ironsource.sdk.g.d;
import java.util.ArrayList;
import java.util.Iterator;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public d f8736a;

    /* renamed from: b  reason: collision with root package name */
    public long f8737b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<f> f8738c;

    /* renamed from: d  reason: collision with root package name */
    public f f8739d;

    /* renamed from: e  reason: collision with root package name */
    public int f8740e;

    /* renamed from: f  reason: collision with root package name */
    public int f8741f;

    /* renamed from: g  reason: collision with root package name */
    public c f8742g;

    /* renamed from: h  reason: collision with root package name */
    private int f8743h;

    public e() {
        this.f8736a = new d();
        this.f8738c = new ArrayList<>();
    }

    public e(int i, long j, d dVar, int i2, c cVar, int i3) {
        this.f8738c = new ArrayList<>();
        this.f8743h = i;
        this.f8737b = j;
        this.f8736a = dVar;
        this.f8740e = i2;
        this.f8741f = i3;
        this.f8742g = cVar;
    }

    public final f a() {
        Iterator<f> it = this.f8738c.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f8739d;
    }

    public final f a(String str) {
        Iterator<f> it = this.f8738c.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
