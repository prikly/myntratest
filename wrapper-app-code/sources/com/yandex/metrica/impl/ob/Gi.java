package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import org.json.JSONObject;

public final class Gi {

    /* renamed from: a  reason: collision with root package name */
    private final C9 f4055a;

    public Gi(C9 c9) {
        this.f4055a = c9;
    }

    public final void a(Ui ui, JSONObject jSONObject) {
        If.h hVar = new If.h();
        JSONObject optJSONObject = jSONObject.optJSONObject("egress");
        if (optJSONObject != null) {
            hVar.f4166a = optJSONObject.optString("url", hVar.f4166a);
            hVar.f4167b = optJSONObject.optInt("repeated_delay", hVar.f4167b);
            hVar.f4168c = optJSONObject.optInt("random_delay_window", hVar.f4168c);
            hVar.f4169d = optJSONObject.optBoolean("background_allowed", hVar.f4169d);
            hVar.f4170e = optJSONObject.optBoolean("diagnostic_enabled", hVar.f4170e);
        }
        ui.a(this.f4055a.toModel(hVar));
    }

    public Gi() {
        this(new C9());
    }
}
