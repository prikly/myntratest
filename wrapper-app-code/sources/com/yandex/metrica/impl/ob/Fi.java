package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import org.json.JSONObject;

public final class Fi {

    /* renamed from: a  reason: collision with root package name */
    private final B9 f4014a;

    public Fi(B9 b9) {
        this.f4014a = b9;
    }

    public final void a(Ui ui, JSONObject jSONObject) {
        If.g gVar = new If.g();
        JSONObject optJSONObject = jSONObject.optJSONObject("easy_collecting");
        if (optJSONObject != null) {
            gVar.f4165a = optJSONObject.optLong("first_delay_seconds", gVar.f4165a);
        }
        ui.a(this.f4014a.toModel(gVar));
    }

    public Fi() {
        this(new B9());
    }
}
