package com.criteo.publisher.f0;

import com.criteo.publisher.n0.g;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MetricSendingQueueConfiguration.kt */
public class v implements a0<n> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<n> f2497a = n.class;

    /* renamed from: b  reason: collision with root package name */
    private final g f2498b;

    public v(g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "buildConfigWrapper");
        this.f2498b = gVar;
    }

    public int c() {
        return this.f2498b.k();
    }

    public String d() {
        String f2 = this.f2498b.f();
        Intrinsics.checkExpressionValueIsNotNull(f2, "buildConfigWrapper.csmQueueFilename");
        return f2;
    }

    public Class<n> b() {
        return this.f2497a;
    }

    public int a() {
        return this.f2498b.h();
    }
}
