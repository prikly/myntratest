package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import org.json.JSONObject;

class Ci {

    /* renamed from: a  reason: collision with root package name */
    private final C0721t9 f3835a;

    public Ci() {
        this(new C0721t9());
    }

    /* access modifiers changed from: package-private */
    public void a(Ui ui, JSONObject jSONObject) {
        C0721t9 t9Var = this.f3835a;
        If.b bVar = new If.b();
        JSONObject optJSONObject = jSONObject.optJSONObject("auto_inapp_collecting");
        if (optJSONObject != null) {
            bVar.f4151a = optJSONObject.optInt("send_frequency_seconds", bVar.f4151a);
            bVar.f4152b = optJSONObject.optInt("first_collecting_inapp_max_age_seconds", bVar.f4152b);
        }
        ui.a(t9Var.toModel(bVar));
    }

    Ci(C0721t9 t9Var) {
        this.f3835a = t9Var;
    }
}
