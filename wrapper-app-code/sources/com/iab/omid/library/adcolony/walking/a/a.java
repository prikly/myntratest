package com.iab.omid.library.adcolony.walking.a;

import com.iab.omid.library.adcolony.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

public abstract class a extends b {

    /* renamed from: a  reason: collision with root package name */
    protected final HashSet<String> f7511a;

    /* renamed from: b  reason: collision with root package name */
    protected final JSONObject f7512b;

    /* renamed from: c  reason: collision with root package name */
    protected final long f7513c;

    public a(b.C0066b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f7511a = new HashSet<>(hashSet);
        this.f7512b = jSONObject;
        this.f7513c = j;
    }
}
