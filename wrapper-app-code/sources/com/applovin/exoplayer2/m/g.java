package com.applovin.exoplayer2.m;

import android.view.Surface;
import com.applovin.exoplayer2.f.h;
import com.applovin.exoplayer2.f.i;

public class g extends h {

    /* renamed from: c  reason: collision with root package name */
    public final int f13708c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13709d;

    public g(Throwable th, i iVar, Surface surface) {
        super(th, iVar);
        this.f13708c = System.identityHashCode(surface);
        this.f13709d = surface == null || surface.isValid();
    }
}
