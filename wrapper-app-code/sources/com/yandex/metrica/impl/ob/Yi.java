package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class Yi {

    /* renamed from: a  reason: collision with root package name */
    private final C0328da f5386a;

    /* renamed from: b  reason: collision with root package name */
    private final Zi f5387b;

    public Yi() {
        this(new C0328da(), new Zi());
    }

    public void a(Ui ui, JSONObject jSONObject) {
        C0328da daVar = this.f5386a;
        If.w wVar = new If.w();
        JSONObject optJSONObject = jSONObject.optJSONObject("ui_parsing");
        if (optJSONObject != null) {
            wVar.f4248a = optJSONObject.optInt("too_long_text_bound", wVar.f4248a);
            wVar.f4249b = optJSONObject.optInt("truncated_text_bound", wVar.f4249b);
            wVar.f4250c = optJSONObject.optInt("max_visited_children_in_level", wVar.f4250c);
            wVar.f4251d = Tl.a(Tl.a(optJSONObject, "after_create_timeout", (Long) null), TimeUnit.SECONDS, wVar.f4251d);
            wVar.f4252e = optJSONObject.optBoolean("relative_text_size_calculation", wVar.f4252e);
            wVar.f4253f = optJSONObject.optBoolean("error_reporting", wVar.f4253f);
            wVar.f4254g = optJSONObject.optBoolean("parsing_allowed_by_default", wVar.f4254g);
            wVar.f4255h = this.f5387b.a(optJSONObject.optJSONArray("filters"));
        }
        ui.a(daVar.toModel(wVar));
    }

    Yi(C0328da daVar, Zi zi) {
        this.f5386a = daVar;
        this.f5387b = zi;
    }
}
