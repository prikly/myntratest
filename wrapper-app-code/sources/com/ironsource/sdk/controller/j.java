package com.ironsource.sdk.controller;

import android.text.TextUtils;
import com.ironsource.sdk.g.c;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.j.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, c> f9205a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, c> f9206b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, c> f9207c = new LinkedHashMap();

    public final c a(d.e eVar, String str) {
        Map<String, c> a2;
        if (TextUtils.isEmpty(str) || (a2 = a(eVar)) == null) {
            return null;
        }
        return a2.get(str);
    }

    public final c a(d.e eVar, String str, Map<String, String> map, a aVar) {
        c cVar = new c(str, str, map, aVar);
        a(eVar, str, cVar);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public Map<String, c> a(d.e eVar) {
        if (eVar.name().equalsIgnoreCase(d.e.RewardedVideo.name())) {
            return this.f9205a;
        }
        if (eVar.name().equalsIgnoreCase(d.e.Interstitial.name())) {
            return this.f9206b;
        }
        if (eVar.name().equalsIgnoreCase(d.e.Banner.name())) {
            return this.f9207c;
        }
        return null;
    }

    public void a(d.e eVar, String str, c cVar) {
        Map<String, c> a2;
        if (!TextUtils.isEmpty(str) && (a2 = a(eVar)) != null) {
            a2.put(str, cVar);
        }
    }

    public final Collection<c> b(d.e eVar) {
        Map<String, c> a2 = a(eVar);
        return a2 != null ? a2.values() : new ArrayList();
    }
}
