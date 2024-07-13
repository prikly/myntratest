package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.a.b;
import com.iab.omid.library.ironsrc.walking.a.c;
import com.iab.omid.library.ironsrc.walking.a.d;
import com.iab.omid.library.ironsrc.walking.a.e;
import com.iab.omid.library.ironsrc.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

public class b implements b.C0078b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f7956a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7957b;

    public b(c cVar) {
        this.f7957b = cVar;
    }

    public void a() {
        this.f7957b.b(new d(this));
    }

    public void a(JSONObject jSONObject) {
        this.f7956a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f7957b.b(new f(this, hashSet, jSONObject, j));
    }

    public JSONObject b() {
        return this.f7956a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f7957b.b(new e(this, hashSet, jSONObject, j));
    }
}
