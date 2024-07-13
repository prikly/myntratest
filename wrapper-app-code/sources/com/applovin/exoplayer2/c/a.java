package com.applovin.exoplayer2.c;

import androidx.recyclerview.widget.RecyclerView;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private int f11399a;

    public void a() {
        this.f11399a = 0;
    }

    public final void a_(int i) {
        this.f11399a = i;
    }

    public final void b(int i) {
        this.f11399a = i | this.f11399a;
    }

    public final boolean b() {
        return d(RecyclerView.UNDEFINED_DURATION);
    }

    public final void c(int i) {
        this.f11399a = (~i) & this.f11399a;
    }

    public final boolean c() {
        return d(4);
    }

    public final boolean d() {
        return d(1);
    }

    /* access modifiers changed from: protected */
    public final boolean d(int i) {
        return (this.f11399a & i) == i;
    }

    public final boolean e() {
        return d(268435456);
    }
}
