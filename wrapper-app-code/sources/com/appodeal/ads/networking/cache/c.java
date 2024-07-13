package com.appodeal.ads.networking.cache;

import com.appodeal.ads.storage.a;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.x0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class c implements x0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f16982a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16983b;

    public /* synthetic */ c(a aVar) {
        this("init_response", aVar);
    }

    public c(String str, a aVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(aVar, "keyValueStorage");
        this.f16982a = str;
        this.f16983b = aVar;
    }

    public final JSONObject a() {
        try {
            JSONObject component1 = this.f16983b.a(this.f16982a).component1();
            if (component1 != null) {
                return component1;
            }
            this.f16983b.c(this.f16982a);
            return null;
        } catch (Throwable th) {
            Log.log(th);
            return null;
        }
    }

    public final void a(JSONObject jSONObject) {
        a aVar = this.f16983b;
        String str = this.f16982a;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "value.toString()");
        aVar.a(Integer.MAX_VALUE, System.currentTimeMillis(), str, jSONObject2);
    }
}
