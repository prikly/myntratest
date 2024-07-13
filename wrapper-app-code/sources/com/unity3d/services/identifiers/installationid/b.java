package com.unity3d.services.identifiers.installationid;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f9643a = "";

    /* renamed from: b  reason: collision with root package name */
    public final a f9644b;

    /* renamed from: c  reason: collision with root package name */
    public final a f9645c;

    /* renamed from: d  reason: collision with root package name */
    public final a f9646d;

    public b(a aVar, a aVar2, a aVar3) {
        Intrinsics.checkNotNullParameter(aVar, "installationIdProvider");
        Intrinsics.checkNotNullParameter(aVar2, "analyticsIdProvider");
        Intrinsics.checkNotNullParameter(aVar3, "unityAdsIdProvider");
        this.f9644b = aVar;
        this.f9645c = aVar2;
        this.f9646d = aVar3;
        a();
        b();
    }

    public final void a() {
        String str;
        a aVar;
        boolean z = true;
        if (this.f9644b.a().length() > 0) {
            aVar = this.f9644b;
        } else {
            if (this.f9645c.a().length() > 0) {
                aVar = this.f9645c;
            } else {
                if (this.f9646d.a().length() <= 0) {
                    z = false;
                }
                if (z) {
                    aVar = this.f9646d;
                } else {
                    str = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(str, "UUID.randomUUID().toString()");
                    this.f9643a = str;
                }
            }
        }
        str = aVar.a();
        this.f9643a = str;
    }

    public final void b() {
        this.f9644b.a(this.f9643a);
        this.f9645c.a(this.f9643a);
        this.f9646d.a(this.f9643a);
    }
}
