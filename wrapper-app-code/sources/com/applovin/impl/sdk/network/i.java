package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.c;
import java.util.Map;
import org.json.JSONObject;

public class i<T> extends c {

    /* renamed from: a  reason: collision with root package name */
    private String f15734a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15735b;

    public static class a<T> extends c.a<T> {
        /* access modifiers changed from: private */
        public String o;
        /* access modifiers changed from: private */
        public boolean p;

        public a(n nVar) {
            super(nVar);
            this.f15667h = ((Integer) nVar.a(b.cP)).intValue();
            this.i = ((Integer) nVar.a(b.cO)).intValue();
            this.j = ((Integer) nVar.a(b.cU)).intValue();
        }

        /* renamed from: b */
        public a a(T t) {
            this.f15666g = t;
            return this;
        }

        /* renamed from: b */
        public a a(JSONObject jSONObject) {
            this.f15665f = jSONObject;
            return this;
        }

        /* renamed from: b */
        public i<T> a() {
            return new i<>(this);
        }

        /* renamed from: c */
        public a a(Map<String, String> map) {
            this.f15663d = map;
            return this;
        }

        /* renamed from: d */
        public a a(int i) {
            this.f15667h = i;
            return this;
        }

        /* renamed from: d */
        public a a(String str) {
            this.f15661b = str;
            return this;
        }

        /* renamed from: d */
        public a b(Map<String, String> map) {
            this.f15664e = map;
            return this;
        }

        /* renamed from: e */
        public a b(int i) {
            this.i = i;
            return this;
        }

        /* renamed from: e */
        public a c(String str) {
            this.f15662c = str;
            return this;
        }

        /* renamed from: e */
        public a c(boolean z) {
            this.m = z;
            return this;
        }

        /* renamed from: f */
        public a c(int i) {
            this.j = i;
            return this;
        }

        /* renamed from: f */
        public a b(String str) {
            this.f15660a = str;
            return this;
        }

        /* renamed from: f */
        public a d(boolean z) {
            this.n = z;
            return this;
        }

        public a g(String str) {
            this.o = str;
            return this;
        }

        public a g(boolean z) {
            this.p = z;
            return this;
        }
    }

    protected i(a aVar) {
        super(aVar);
        this.f15734a = aVar.o;
        this.f15735b = aVar.p;
    }

    public static a b(n nVar) {
        return new a(nVar);
    }

    public boolean p() {
        return this.f15734a != null;
    }

    public String q() {
        return this.f15734a;
    }

    public boolean r() {
        return this.f15735b;
    }
}
