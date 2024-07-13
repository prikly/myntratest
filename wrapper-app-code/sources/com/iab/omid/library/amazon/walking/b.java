package com.iab.omid.library.amazon.walking;

import com.iab.omid.library.amazon.walking.a.b;
import com.iab.omid.library.amazon.walking.a.c;
import com.iab.omid.library.amazon.walking.a.d;
import com.iab.omid.library.amazon.walking.a.e;
import com.iab.omid.library.amazon.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

public class b implements b.C0069b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f7627a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7628b;

    public b(c cVar) {
        this.f7628b = cVar;
    }

    public void a() {
        this.f7628b.b(new d(this));
    }

    public void a(JSONObject jSONObject) {
        this.f7627a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f7628b.b(new f(this, hashSet, jSONObject, j));
    }

    public JSONObject b() {
        return this.f7627a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f7628b.b(new e(this, hashSet, jSONObject, j));
    }
}
