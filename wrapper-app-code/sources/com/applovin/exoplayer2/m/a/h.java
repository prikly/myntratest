package com.applovin.exoplayer2.m.a;

import android.media.MediaFormat;
import com.applovin.exoplayer2.l.af;
import com.applovin.exoplayer2.m.l;
import com.applovin.exoplayer2.v;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

final class h implements a, l {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f13657a;

    /* renamed from: b  reason: collision with root package name */
    private final c f13658b;

    /* renamed from: c  reason: collision with root package name */
    private final af<Long> f13659c;

    /* renamed from: d  reason: collision with root package name */
    private final af<e> f13660d;

    /* renamed from: e  reason: collision with root package name */
    private volatile int f13661e;

    /* renamed from: f  reason: collision with root package name */
    private int f13662f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f13663g;

    private void a(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.f13663g;
        int i2 = this.f13662f;
        this.f13663g = bArr;
        if (i == -1) {
            i = this.f13661e;
        }
        this.f13662f = i;
        if (i2 != i || !Arrays.equals(bArr2, this.f13663g)) {
            e eVar = null;
            byte[] bArr3 = this.f13663g;
            if (bArr3 != null) {
                eVar = f.a(bArr3, this.f13662f);
            }
            if (eVar == null || !g.a(eVar)) {
                eVar = e.a(this.f13662f);
            }
            this.f13660d.a(j, eVar);
        }
    }

    public void a() {
        this.f13659c.a();
        this.f13658b.a();
        this.f13657a.set(true);
    }

    public void a(int i) {
        this.f13661e = i;
    }

    public void a(long j, long j2, v vVar, MediaFormat mediaFormat) {
        this.f13659c.a(j2, Long.valueOf(j));
        a(vVar.v, vVar.w, j2);
    }

    public void a(long j, float[] fArr) {
        this.f13658b.a(j, fArr);
    }
}
