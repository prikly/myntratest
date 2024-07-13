package com.applovin.exoplayer2;

import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.j.d;
import com.applovin.exoplayer2.k.b;
import com.applovin.exoplayer2.k.m;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.ads.AdSize;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public class l implements aa {

    /* renamed from: a  reason: collision with root package name */
    private final m f13497a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13498b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13499c;

    /* renamed from: d  reason: collision with root package name */
    private final long f13500d;

    /* renamed from: e  reason: collision with root package name */
    private final long f13501e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13502f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f13503g;

    /* renamed from: h  reason: collision with root package name */
    private final long f13504h;
    private final boolean i;
    private int j;
    private boolean k;

    public l() {
        this(new m(true, 65536), 50000, 50000, IronSourceConstants.IS_INSTANCE_NOT_FOUND, 5000, -1, false, 0, false);
    }

    protected l(m mVar, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, boolean z2) {
        a(i4, 0, "bufferForPlaybackMs", BuildConfig.ADAPTER_VERSION);
        a(i5, 0, "bufferForPlaybackAfterRebufferMs", BuildConfig.ADAPTER_VERSION);
        a(i2, i4, "minBufferMs", "bufferForPlaybackMs");
        a(i2, i5, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i3, i2, "maxBufferMs", "minBufferMs");
        a(i7, 0, "backBufferDurationMs", BuildConfig.ADAPTER_VERSION);
        this.f13497a = mVar;
        this.f13498b = h.b((long) i2);
        this.f13499c = h.b((long) i3);
        this.f13500d = h.b((long) i4);
        this.f13501e = h.b((long) i5);
        this.f13502f = i6;
        this.j = i6 == -1 ? 13107200 : i6;
        this.f13503g = z;
        this.f13504h = h.b((long) i7);
        this.i = z2;
    }

    private static int a(int i2) {
        switch (i2) {
            case AdSize.AUTO_HEIGHT:
                return 0;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static void a(int i2, int i3, String str, String str2) {
        boolean z = i2 >= i3;
        a.a(z, (Object) str + " cannot be less than " + str2);
    }

    private void a(boolean z) {
        int i2 = this.f13502f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        this.j = i2;
        this.k = false;
        if (z) {
            this.f13497a.d();
        }
    }

    /* access modifiers changed from: protected */
    public int a(ar[] arVarArr, d[] dVarArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < arVarArr.length; i3++) {
            if (dVarArr[i3] != null) {
                i2 += a(arVarArr[i3].a());
            }
        }
        return Math.max(13107200, i2);
    }

    public void a() {
        a(false);
    }

    public void a(ar[] arVarArr, ad adVar, d[] dVarArr) {
        int i2 = this.f13502f;
        if (i2 == -1) {
            i2 = a(arVarArr, dVarArr);
        }
        this.j = i2;
        this.f13497a.a(i2);
    }

    public boolean a(long j2, float f2, boolean z, long j3) {
        long b2 = ai.b(j2, f2);
        long j4 = z ? this.f13501e : this.f13500d;
        if (j3 != -9223372036854775807L) {
            j4 = Math.min(j3 / 2, j4);
        }
        return j4 <= 0 || b2 >= j4 || (!this.f13503g && this.f13497a.e() >= this.j);
    }

    public boolean a(long j2, long j3, float f2) {
        boolean z = true;
        boolean z2 = this.f13497a.e() >= this.j;
        long j4 = this.f13498b;
        if (f2 > 1.0f) {
            j4 = Math.min(ai.a(j4, f2), this.f13499c);
        }
        if (j3 < Math.max(j4, 500000)) {
            if (!this.f13503g && z2) {
                z = false;
            }
            this.k = z;
            if (!z && j3 < 500000) {
                q.c("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= this.f13499c || z2) {
            this.k = false;
        }
        return this.k;
    }

    public void b() {
        a(true);
    }

    public void c() {
        a(true);
    }

    public b d() {
        return this.f13497a;
    }

    public long e() {
        return this.f13504h;
    }

    public boolean f() {
        return this.i;
    }
}
