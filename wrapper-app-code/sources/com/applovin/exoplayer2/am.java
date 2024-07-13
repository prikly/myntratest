package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class am implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final am f11104a = new am(1.0f);

    /* renamed from: d  reason: collision with root package name */
    public static final g.a<am> f11105d = $$Lambda$am$2JaHuxdc0BBcW9SOBKSIQ2QZ0.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public final float f11106b;

    /* renamed from: c  reason: collision with root package name */
    public final float f11107c;

    /* renamed from: e  reason: collision with root package name */
    private final int f11108e;

    public am(float f2) {
        this(f2, 1.0f);
    }

    public am(float f2, float f3) {
        boolean z = true;
        a.a(f2 > 0.0f);
        a.a(f3 <= 0.0f ? false : z);
        this.f11106b = f2;
        this.f11107c = f3;
        this.f11108e = Math.round(f2 * 1000.0f);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ am a(Bundle bundle) {
        return new am(bundle.getFloat(a(0), 1.0f), bundle.getFloat(a(1), 1.0f));
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public long a(long j) {
        return j * ((long) this.f11108e);
    }

    public am a(float f2) {
        return new am(f2, this.f11107c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        am amVar = (am) obj;
        return this.f11106b == amVar.f11106b && this.f11107c == amVar.f11107c;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Float.floatToRawIntBits(this.f11106b)) * 31) + Float.floatToRawIntBits(this.f11107c);
    }

    public String toString() {
        return ai.a("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f11106b), Float.valueOf(this.f11107c));
    }
}
