package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.segments.j;
import com.appodeal.ads.segments.n;
import com.appodeal.ads.segments.o;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class v1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17607a;

    public v1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17607a = context;
    }

    public final void a(JSONObject jSONObject) {
        if (j.b().b(jSONObject)) {
            Context context = this.f17607a;
            Lazy lazy = n.f17279a;
            n.a(context, (Function0<Unit>) o.f17287a);
        }
    }
}
