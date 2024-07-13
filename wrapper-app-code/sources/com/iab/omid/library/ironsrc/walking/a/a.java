package com.iab.omid.library.ironsrc.walking.a;

import com.iab.omid.library.ironsrc.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

public abstract class a extends b {

    /* renamed from: a  reason: collision with root package name */
    protected final HashSet<String> f7947a;

    /* renamed from: b  reason: collision with root package name */
    protected final JSONObject f7948b;

    /* renamed from: c  reason: collision with root package name */
    protected final long f7949c;

    public a(b.C0078b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f7947a = new HashSet<>(hashSet);
        this.f7948b = jSONObject;
        this.f7949c = j;
    }
}
