package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.service.ServicesRegistry;
import com.appodeal.ads.networking.b;
import com.appodeal.ads.utils.Log;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

public final class a3 {

    /* renamed from: a  reason: collision with root package name */
    public final l1 f16173a;

    public a3(l1 l1Var) {
        Intrinsics.checkNotNullParameter(l1Var, "getServiceOptions");
        this.f16173a = l1Var;
    }

    public static Object a(a3 a3Var, Context context, b bVar, v4 v4Var) {
        ServicesRegistry a2 = com.appodeal.ads.services.b.a();
        boolean z = r0.f17086b || f1.l() || r0.f17088d == Log.LogLevel.verbose;
        String a3 = x2.a();
        e1 e1Var = e1.f16385a;
        Intrinsics.checkNotNullExpressionValue(e1Var, "instance");
        j0 j0Var = j0.f16489c;
        m5 m5Var = m5.f16615c;
        Intrinsics.checkNotNullExpressionValue(m5Var, "instance");
        a3Var.getClass();
        return CoroutineScopeKt.coroutineScope(new z2(a3Var, context, bVar, z, a3, j0Var, e1Var, m5Var, a2, (Continuation<? super z2>) null), v4Var);
    }
}
