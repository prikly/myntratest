package com.applovin.exoplayer2.h;

import android.content.Context;
import android.util.SparseArray;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.h.u;
import com.applovin.exoplayer2.k.i;
import com.applovin.exoplayer2.k.o;

public final class f implements r {

    /* renamed from: a  reason: collision with root package name */
    private final i.a f12780a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<r> f12781b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f12782c;

    /* renamed from: d  reason: collision with root package name */
    private long f12783d;

    /* renamed from: e  reason: collision with root package name */
    private long f12784e;

    /* renamed from: f  reason: collision with root package name */
    private long f12785f;

    /* renamed from: g  reason: collision with root package name */
    private float f12786g;

    /* renamed from: h  reason: collision with root package name */
    private float f12787h;

    public f(Context context, l lVar) {
        this((i.a) new o.a(context), lVar);
    }

    public f(i.a aVar, l lVar) {
        this.f12780a = aVar;
        SparseArray<r> a2 = a(aVar, lVar);
        this.f12781b = a2;
        this.f12782c = new int[a2.size()];
        for (int i = 0; i < this.f12781b.size(); i++) {
            this.f12782c[i] = this.f12781b.keyAt(i);
        }
        this.f12783d = -9223372036854775807L;
        this.f12784e = -9223372036854775807L;
        this.f12785f = -9223372036854775807L;
        this.f12786g = -3.4028235E38f;
        this.f12787h = -3.4028235E38f;
    }

    private static SparseArray<r> a(i.a aVar, l lVar) {
        SparseArray<r> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (r) Class.forName("com.applovin.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(r.class).getConstructor(new Class[]{i.a.class}).newInstance(new Object[]{aVar}));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (r) Class.forName("com.applovin.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(r.class).getConstructor(new Class[]{i.a.class}).newInstance(new Object[]{aVar}));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (r) Class.forName("com.applovin.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(r.class).getConstructor(new Class[]{i.a.class}).newInstance(new Object[]{aVar}));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (r) Class.forName("com.applovin.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(r.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new u.a(aVar, lVar));
        return sparseArray;
    }
}
