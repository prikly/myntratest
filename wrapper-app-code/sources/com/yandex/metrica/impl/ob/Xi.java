package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import org.json.JSONObject;

public class Xi {

    /* renamed from: a  reason: collision with root package name */
    private C0303ca f5345a;

    /* renamed from: b  reason: collision with root package name */
    private final Zi f5346b;

    public Xi() {
        this(new C0303ca(), new Zi());
    }

    public C0439hl a(JSONObject jSONObject, String str, If.v vVar) {
        C0303ca caVar = this.f5345a;
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            vVar.f4240a = optJSONObject.optBoolean("text_size_collecting", vVar.f4240a);
            vVar.f4241b = optJSONObject.optBoolean("relative_text_size_collecting", vVar.f4241b);
            vVar.f4242c = optJSONObject.optBoolean("text_visibility_collecting", vVar.f4242c);
            vVar.f4243d = optJSONObject.optBoolean("text_style_collecting", vVar.f4243d);
            vVar.i = optJSONObject.optBoolean("info_collecting", vVar.i);
            vVar.j = optJSONObject.optBoolean("non_content_view_collecting", vVar.j);
            vVar.k = optJSONObject.optBoolean("text_length_collecting", vVar.k);
            vVar.l = optJSONObject.optBoolean("view_hierarchical", vVar.l);
            vVar.n = optJSONObject.optBoolean("ignore_filtered", vVar.n);
            vVar.o = optJSONObject.optBoolean("web_view_urls_collecting", vVar.o);
            vVar.f4244e = optJSONObject.optInt("too_long_text_bound", vVar.f4244e);
            vVar.f4245f = optJSONObject.optInt("truncated_text_bound", vVar.f4245f);
            vVar.f4246g = optJSONObject.optInt("max_entities_count", vVar.f4246g);
            vVar.f4247h = optJSONObject.optInt("max_full_content_length", vVar.f4247h);
            vVar.p = optJSONObject.optInt("web_view_url_limit", vVar.p);
            vVar.m = this.f5346b.a(optJSONObject.optJSONArray("filters"));
        }
        return caVar.toModel(vVar);
    }

    Xi(C0303ca caVar, Zi zi) {
        this.f5345a = caVar;
        this.f5346b = zi;
    }
}
