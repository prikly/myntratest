package com.iab.omid.library.amazon.walking.a;

import com.iab.omid.library.amazon.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

public abstract class a extends b {

    /* renamed from: a  reason: collision with root package name */
    protected final HashSet<String> f7618a;

    /* renamed from: b  reason: collision with root package name */
    protected final JSONObject f7619b;

    /* renamed from: c  reason: collision with root package name */
    protected final long f7620c;

    public a(b.C0069b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f7618a = new HashSet<>(hashSet);
        this.f7619b = jSONObject;
        this.f7620c = j;
    }
}
