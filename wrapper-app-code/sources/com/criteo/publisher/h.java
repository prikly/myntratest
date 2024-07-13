package com.criteo.publisher;

import com.criteo.publisher.c0.a;
import com.criteo.publisher.model.o;
import com.criteo.publisher.model.r;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CdbCallListener.kt */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private final a f2518a;

    /* renamed from: b  reason: collision with root package name */
    private final e f2519b;

    /* renamed from: c  reason: collision with root package name */
    private final com.criteo.publisher.l0.a f2520c;

    public h(a aVar, e eVar, com.criteo.publisher.l0.a aVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, "bidLifecycleListener");
        Intrinsics.checkParameterIsNotNull(eVar, "bidManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "consentData");
        this.f2518a = aVar;
        this.f2519b = eVar;
        this.f2520c = aVar2;
    }

    public void a(o oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "cdbRequest");
        this.f2518a.a(oVar);
    }

    public void a(o oVar, Exception exc) {
        Intrinsics.checkParameterIsNotNull(oVar, "cdbRequest");
        Intrinsics.checkParameterIsNotNull(exc, "exception");
        this.f2518a.a(oVar, exc);
    }

    public void a(o oVar, r rVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "cdbRequest");
        Intrinsics.checkParameterIsNotNull(rVar, "cdbResponse");
        Boolean a2 = rVar.a();
        if (a2 != null) {
            com.criteo.publisher.l0.a aVar = this.f2520c;
            Intrinsics.checkExpressionValueIsNotNull(a2, "it");
            aVar.a(a2.booleanValue());
        }
        this.f2519b.a(rVar.c());
        this.f2518a.a(oVar, rVar);
    }
}
