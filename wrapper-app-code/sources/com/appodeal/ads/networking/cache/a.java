package com.appodeal.ads.networking.cache;

import com.appodeal.ads.storage.o;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.x0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class a implements x0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f16978a;

    /* renamed from: b  reason: collision with root package name */
    public final com.appodeal.ads.storage.a f16979b;

    public /* synthetic */ a(o oVar) {
        this("config_response", oVar);
    }

    public a(String str, o oVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(oVar, "keyValueStorage");
        this.f16978a = str;
        this.f16979b = oVar;
    }

    public final JSONObject a() {
        try {
            JSONObject component1 = this.f16979b.a(this.f16978a).component1();
            if (component1 != null) {
                return component1;
            }
            this.f16979b.c(this.f16978a);
            return null;
        } catch (Throwable th) {
            Log.log(th);
            return null;
        }
    }

    public final void a(JSONObject jSONObject) {
        com.appodeal.ads.storage.a aVar = this.f16979b;
        String str = this.f16978a;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "value.toString()");
        aVar.a(Integer.MAX_VALUE, System.currentTimeMillis(), str, jSONObject2);
    }
}
