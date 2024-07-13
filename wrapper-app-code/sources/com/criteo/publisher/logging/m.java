package com.criteo.publisher.logging;

import com.criteo.publisher.f0.a0;
import com.criteo.publisher.n0.g;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemoteLogSendingQueueConfiguration.kt */
public final class m implements a0<RemoteLogRecords> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<RemoteLogRecords> f2665a = RemoteLogRecords.class;

    /* renamed from: b  reason: collision with root package name */
    private final g f2666b;

    public m(g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "buildConfigWrapper");
        this.f2666b = gVar;
    }

    public int c() {
        return this.f2666b.m();
    }

    public String d() {
        String p = this.f2666b.p();
        Intrinsics.checkExpressionValueIsNotNull(p, "buildConfigWrapper.remoteLogQueueFilename");
        return p;
    }

    public Class<RemoteLogRecords> b() {
        return this.f2665a;
    }

    public int a() {
        return this.f2666b.i();
    }
}
