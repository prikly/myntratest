package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.impl.ob.C0604oc;
import com.yandex.metrica.impl.ob.E;

public class Hc {

    /* renamed from: a  reason: collision with root package name */
    public final C0604oc.a f4106a;

    /* renamed from: b  reason: collision with root package name */
    private Long f4107b;

    /* renamed from: c  reason: collision with root package name */
    private long f4108c;

    /* renamed from: d  reason: collision with root package name */
    private long f4109d;

    /* renamed from: e  reason: collision with root package name */
    private Location f4110e;

    /* renamed from: f  reason: collision with root package name */
    private E.b.a f4111f;

    public Hc(C0604oc.a aVar, long j, long j2, Location location, E.b.a aVar2, Long l) {
        this.f4106a = aVar;
        this.f4107b = l;
        this.f4108c = j;
        this.f4109d = j2;
        this.f4110e = location;
        this.f4111f = aVar2;
    }

    public E.b.a a() {
        return this.f4111f;
    }

    public Long b() {
        return this.f4107b;
    }

    public Location c() {
        return this.f4110e;
    }

    public long d() {
        return this.f4109d;
    }

    public long e() {
        return this.f4108c;
    }

    public String toString() {
        return "LocationWrapper{collectionMode=" + this.f4106a + ", mIncrementalId=" + this.f4107b + ", mReceiveTimestamp=" + this.f4108c + ", mReceiveElapsedRealtime=" + this.f4109d + ", mLocation=" + this.f4110e + ", mChargeType=" + this.f4111f + '}';
    }
}
