package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final d f3648a;

    /* renamed from: b  reason: collision with root package name */
    private final Function1 f3649b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3650c;

    /* renamed from: d  reason: collision with root package name */
    private final w f3651d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(android.content.Intent r8, kotlin.jvm.functions.Function1 r9, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "converter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "serviceShortTag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            com.yandex.metrica.identifiers.impl.d r2 = new com.yandex.metrica.identifiers.impl.d
            r2.<init>(r8, r10)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "[AdInServiceConnectionController-"
            r8.append(r0)
            r8.append(r10)
            r0 = 93
            r8.append(r0)
            java.lang.String r4 = r8.toString()
            com.yandex.metrica.identifiers.impl.w r6 = new com.yandex.metrica.identifiers.impl.w
            r6.<init>()
            r1 = r7
            r3 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.identifiers.impl.e.<init>(android.content.Intent, kotlin.jvm.functions.Function1, java.lang.String):void");
    }

    public e(d dVar, Function1 function1, String str, String str2, w wVar) {
        Intrinsics.checkNotNullParameter(dVar, "connection");
        Intrinsics.checkNotNullParameter(function1, "converter");
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(str2, "serviceShortTag");
        Intrinsics.checkNotNullParameter(wVar, "safePackageManager");
        this.f3648a = dVar;
        this.f3649b = function1;
        this.f3650c = str2;
        this.f3651d = wVar;
    }

    public final Object a(Context context) {
        ResolveInfo resolveInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intent a2 = this.f3648a.a();
        Intrinsics.checkNotNullExpressionValue(a2, "connection.intent");
        this.f3651d.getClass();
        IBinder iBinder = null;
        try {
            resolveInfo = context.getPackageManager().resolveService(a2, 0);
        } catch (Throwable unused) {
            resolveInfo = null;
        }
        if (resolveInfo != null) {
            try {
                if (this.f3648a.a(context)) {
                    iBinder = this.f3648a.a(3000);
                }
            } catch (Throwable unused2) {
            }
            if (iBinder != null) {
                return this.f3649b.invoke(iBinder);
            }
            throw new j("could not bind to " + this.f3650c + " services");
        }
        throw new m("could not resolve " + this.f3650c + " services");
    }

    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            this.f3648a.b(context);
        } catch (IllegalArgumentException unused) {
        }
    }
}
