package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.g;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class o implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final o f13770a = new o(0, 0, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final g.a<o> f13771e = $$Lambda$o$lKvSPiFc5eDrEmkBZUTcuRFFGU.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public final int f13772b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13773c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13774d;

    public o(int i, int i2, int i3) {
        this.f13772b = i;
        this.f13773c = i2;
        this.f13774d = i3;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ o a(Bundle bundle) {
        return new o(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0));
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
        return this.f13772b == oVar.f13772b && this.f13773c == oVar.f13773c && this.f13774d == oVar.f13774d;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f13772b) * 31) + this.f13773c) * 31) + this.f13774d;
    }
}
