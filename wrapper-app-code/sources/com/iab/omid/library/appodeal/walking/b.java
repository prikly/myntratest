package com.iab.omid.library.appodeal.walking;

import com.iab.omid.library.appodeal.walking.a.b;
import com.iab.omid.library.appodeal.walking.a.c;
import com.iab.omid.library.appodeal.walking.a.d;
import com.iab.omid.library.appodeal.walking.a.e;
import com.iab.omid.library.appodeal.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

public class b implements b.C0075b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f7848a;

    /* renamed from: b  reason: collision with root package name */
    private final c f7849b;

    public b(c cVar) {
        this.f7849b = cVar;
    }

    public void a() {
        this.f7849b.b(new d(this));
    }

    public void a(JSONObject jSONObject) {
        this.f7848a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f7849b.b(new f(this, hashSet, jSONObject, j));
    }

    public JSONObject b() {
        return this.f7848a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f7849b.b(new e(this, hashSet, jSONObject, j));
    }
}
