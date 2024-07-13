package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public final class r implements i {

    /* renamed from: a  reason: collision with root package name */
    private final e f3667a;

    public r() {
        this(new e(s.f3668a, q.f3666a, "huawei"));
    }

    public r(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "connectionController");
        this.f3667a = eVar;
    }

    public g a(Context context) {
        g gVar;
        e eVar;
        g gVar2;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            v vVar = (v) this.f3667a.a(context);
            gVar = new g(l.OK, new f("huawei", vVar.a(), Boolean.valueOf(vVar.c())), (String) null, 4);
            try {
                eVar = this.f3667a;
            } catch (Throwable unused) {
            }
        } catch (j e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "unknown exception during binding huawei services";
            }
            Intrinsics.checkNotNullParameter(message, "errorMessage");
            gVar2 = new g(l.IDENTIFIER_PROVIDER_UNAVAILABLE, (f) null, message);
        } catch (Throwable th) {
            try {
                this.f3667a.b(context);
            } catch (Throwable unused2) {
            }
            throw th;
        }
        eVar.b(context);
        return gVar;
        gVar = gVar2;
        eVar = this.f3667a;
        eVar.b(context);
        return gVar;
    }
}
