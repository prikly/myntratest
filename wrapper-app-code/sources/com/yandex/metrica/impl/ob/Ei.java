package com.yandex.metrica.impl.ob;

import com.appnext.base.b.d;
import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Tl;
import org.json.JSONArray;
import org.json.JSONObject;

public class Ei {

    /* renamed from: a  reason: collision with root package name */
    private final C0865z9 f3965a;

    public Ei() {
        this(new C0865z9());
    }

    /* access modifiers changed from: package-private */
    public void a(Ui ui, Tl.a aVar) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = aVar.optJSONObject("diagnostics");
        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("functionalities")) != null) {
            C0651qa qaVar = null;
            C0651qa qaVar2 = null;
            C0651qa qaVar3 = null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i);
                    String string = jSONObject.getString("tag");
                    C0865z9 z9Var = this.f3965a;
                    If.e eVar = new If.e();
                    eVar.f4160a = jSONObject.getLong("expiration_timestamp");
                    eVar.f4161b = jSONObject.optInt(d.fn, eVar.f4161b);
                    C0651qa a2 = z9Var.toModel(eVar);
                    if ("activation".equals(string)) {
                        qaVar = a2;
                    } else if ("clids_info".equals(string)) {
                        qaVar2 = a2;
                    } else if ("preload_info".equals(string)) {
                        qaVar3 = a2;
                    }
                } catch (Throwable unused) {
                }
            }
            ui.a(new C0674ra(qaVar, qaVar2, qaVar3));
        }
    }

    Ei(C0865z9 z9Var) {
        this.f3965a = z9Var;
    }
}
