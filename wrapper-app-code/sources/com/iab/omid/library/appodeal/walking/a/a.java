package com.iab.omid.library.appodeal.walking.a;

import com.iab.omid.library.appodeal.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

public abstract class a extends b {

    /* renamed from: a  reason: collision with root package name */
    protected final HashSet<String> f7839a;

    /* renamed from: b  reason: collision with root package name */
    protected final JSONObject f7840b;

    /* renamed from: c  reason: collision with root package name */
    protected final long f7841c;

    public a(b.C0075b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f7839a = new HashSet<>(hashSet);
        this.f7840b = jSONObject;
        this.f7841c = j;
    }
}
