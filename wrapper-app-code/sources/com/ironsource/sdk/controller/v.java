package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.environment.a;
import com.ironsource.environment.f.b;
import com.ironsource.sdk.service.c;
import com.ironsource.sdk.service.d;
import java.util.Iterator;
import org.json.JSONObject;

public class v {

    /* renamed from: a  reason: collision with root package name */
    static final String f9283a = v.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    d f9284b;

    /* renamed from: c  reason: collision with root package name */
    c f9285c;

    /* renamed from: d  reason: collision with root package name */
    Context f9286d;

    /* renamed from: e  reason: collision with root package name */
    private final String f9287e = "oneToken";

    /* renamed from: f  reason: collision with root package name */
    private b f9288f;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        String f9289a;

        /* renamed from: b  reason: collision with root package name */
        JSONObject f9290b;

        /* renamed from: c  reason: collision with root package name */
        String f9291c;

        /* renamed from: d  reason: collision with root package name */
        String f9292d;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public v(Context context, d dVar) {
        this.f9284b = dVar;
        this.f9286d = context;
        this.f9285c = new c();
        this.f9288f = new b();
    }

    /* access modifiers changed from: package-private */
    public JSONObject a() {
        JSONObject a2 = this.f9288f.a();
        Iterator<String> keys = a2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = a2.get(next);
            if (obj instanceof String) {
                a2.put(next, a.AnonymousClass1.a((String) obj));
            }
        }
        return a2;
    }
}
