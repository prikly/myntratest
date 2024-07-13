package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

public abstract class a extends b {

    /* renamed from: c  reason: collision with root package name */
    protected final HashSet<String> f7732c;

    /* renamed from: d  reason: collision with root package name */
    protected final JSONObject f7733d;

    /* renamed from: e  reason: collision with root package name */
    protected final long f7734e;

    public a(b.C0072b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f7732c = new HashSet<>(hashSet);
        this.f7733d = jSONObject;
        this.f7734e = j;
    }
}
