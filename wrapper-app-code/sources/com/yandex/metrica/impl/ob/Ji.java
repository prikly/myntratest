package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Tl;
import org.json.JSONObject;

public class Ji {

    /* renamed from: a  reason: collision with root package name */
    private final J9 f4384a;

    Ji() {
        this(new J9());
    }

    /* access modifiers changed from: package-private */
    public void a(Ui ui, Tl.a aVar) {
        if (ui.e().f4957f) {
            If.j jVar = new If.j();
            JSONObject optJSONObject = aVar.optJSONObject("identity_light_collecting");
            if (optJSONObject != null) {
                jVar.f4179a = optJSONObject.optLong("min_interval_seconds", jVar.f4179a);
            }
            ui.a(this.f4384a.toModel(jVar));
        }
    }

    Ji(J9 j9) {
        this.f4384a = j9;
    }
}
