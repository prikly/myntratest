package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class Vi {

    /* renamed from: a  reason: collision with root package name */
    private final Y9 f5233a;

    public Vi(Y9 y9) {
        this.f5233a = y9;
    }

    public final void a(Ui ui, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("startup_update");
        If.r rVar = new If.r();
        Integer a2 = Tl.a(optJSONObject, "interval_seconds", (Integer) null);
        if (a2 != null) {
            Intrinsics.checkNotNullExpressionValue(a2, "it");
            rVar.f4234a = a2.intValue();
        }
        ui.a(this.f5233a.toModel(rVar));
    }

    public Vi() {
        this(new Y9());
    }
}
