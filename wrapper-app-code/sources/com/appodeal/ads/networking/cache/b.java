package com.appodeal.ads.networking.cache;

import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.storage.a;
import com.appodeal.ads.storage.o;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.x0;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class b implements x0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f16980a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16981b;

    public b(String str, o oVar) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(oVar, "keyValueStorage");
        this.f16980a = str;
        this.f16981b = oVar;
    }

    public final JSONObject a() {
        try {
            Triple<JSONObject, Long, Integer> a2 = this.f16981b.a(this.f16980a);
            JSONObject component1 = a2.component1();
            long longValue = a2.component2().longValue();
            int intValue = a2.component3().intValue();
            if (component1 != null) {
                if (System.currentTimeMillis() - longValue <= ((long) intValue)) {
                    return component1;
                }
            }
            this.f16981b.c(this.f16980a);
            return null;
        } catch (Throwable th) {
            Log.log(th);
            return null;
        }
    }

    public final void a(JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        int optInt = jSONObject.optInt("wst", Constants.DEFAULT_WATERFALL_VALIDITY_PERIOD);
        a aVar = this.f16981b;
        String str = this.f16980a;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "value.toString()");
        aVar.a(optInt, currentTimeMillis, str, jSONObject2);
    }
}
