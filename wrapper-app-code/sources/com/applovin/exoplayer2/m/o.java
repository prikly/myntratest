package com.applovin.exoplayer2.m;

import android.os.Bundle;
import com.applovin.exoplayer2.g;

public final class o implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final o f13756a = new o(0, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final g.a<o> f13757f = $$Lambda$o$_SvHihiuGVws5zym7HfnDtVCEOA.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public final int f13758b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13759c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13760d;

    /* renamed from: e  reason: collision with root package name */
    public final float f13761e;

    public o(int i, int i2) {
        this(i, i2, 0, 1.0f);
    }

    public o(int i, int i2, int i3, float f2) {
        this.f13758b = i;
        this.f13759c = i2;
        this.f13760d = i3;
        this.f13761e = f2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ o a(Bundle bundle) {
        return new o(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0), bundle.getFloat(a(3), 1.0f));
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f13758b == oVar.f13758b && this.f13759c == oVar.f13759c && this.f13760d == oVar.f13760d && this.f13761e == oVar.f13761e;
    }

    public int hashCode() {
        return ((((((217 + this.f13758b) * 31) + this.f13759c) * 31) + this.f13760d) * 31) + Float.floatToRawIntBits(this.f13761e);
    }
}
