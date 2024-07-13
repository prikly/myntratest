package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.b;
import com.iab.omid.library.applovin.walking.async.c;
import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

public class b implements b.C0072b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f7741a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7742b;

    public b(c cVar) {
        this.f7742b = cVar;
    }

    public JSONObject a() {
        return this.f7741a;
    }

    public void a(JSONObject jSONObject) {
        this.f7741a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f7742b.b(new e(this, hashSet, jSONObject, j));
    }

    public void b() {
        this.f7742b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f7742b.b(new f(this, hashSet, jSONObject, j));
    }
}
