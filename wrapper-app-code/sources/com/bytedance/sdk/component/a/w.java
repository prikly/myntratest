package com.bytedance.sdk.component.a;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: PermissionConfigRepository */
class w {

    /* renamed from: a  reason: collision with root package name */
    private final Collection<String> f18291a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, v> f18292b;

    /* renamed from: c  reason: collision with root package name */
    private final k f18293c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<a> f18294d;

    /* compiled from: PermissionConfigRepository */
    interface a {
    }

    /* access modifiers changed from: package-private */
    public v a(String str) {
        if (this.f18291a.contains(str) || TextUtils.equals(str, "host")) {
            return a(str, (JSONObject) null);
        }
        throw new IllegalArgumentException("Namespace: " + str + " not registered.");
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f18294d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        this.f18294d.remove(aVar);
    }

    private v a(String str, JSONObject jSONObject) {
        v vVar = this.f18292b.get(str);
        if (vVar == null) {
            v vVar2 = new v(str, this.f18293c.c(), this.f18293c.a(), this.f18293c.b(), jSONObject);
            this.f18292b.put(str, vVar2);
            return vVar2;
        } else if (jSONObject == null) {
            return vVar;
        } else {
            vVar.a(jSONObject);
            return vVar;
        }
    }
}
