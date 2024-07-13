package com.bytedance.sdk.component.b.a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: OkHttpClient */
public abstract class i implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public List<g> f18909a;

    /* renamed from: b  reason: collision with root package name */
    public long f18910b;

    /* renamed from: c  reason: collision with root package name */
    public TimeUnit f18911c;

    /* renamed from: d  reason: collision with root package name */
    public long f18912d;

    /* renamed from: e  reason: collision with root package name */
    public TimeUnit f18913e;

    /* renamed from: f  reason: collision with root package name */
    public long f18914f;

    /* renamed from: g  reason: collision with root package name */
    public TimeUnit f18915g;

    public abstract b a(k kVar);

    public abstract d a();

    public i(a aVar) {
        this.f18910b = aVar.f18917b;
        this.f18912d = aVar.f18919d;
        this.f18914f = aVar.f18921f;
        this.f18909a = aVar.f18916a;
        this.f18911c = aVar.f18918c;
        this.f18913e = aVar.f18920e;
        this.f18915g = aVar.f18922g;
        this.f18909a = aVar.f18916a;
    }

    /* compiled from: OkHttpClient */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<g> f18916a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public long f18917b = 10000;

        /* renamed from: c  reason: collision with root package name */
        public TimeUnit f18918c = TimeUnit.MILLISECONDS;

        /* renamed from: d  reason: collision with root package name */
        public long f18919d = 10000;

        /* renamed from: e  reason: collision with root package name */
        public TimeUnit f18920e = TimeUnit.MILLISECONDS;

        /* renamed from: f  reason: collision with root package name */
        public long f18921f = 10000;

        /* renamed from: g  reason: collision with root package name */
        public TimeUnit f18922g = TimeUnit.MILLISECONDS;

        public a() {
        }

        public a(i iVar) {
            this.f18917b = iVar.f18910b;
            this.f18918c = iVar.f18911c;
            this.f18919d = iVar.f18912d;
            this.f18920e = iVar.f18913e;
            this.f18921f = iVar.f18914f;
            this.f18922g = iVar.f18915g;
        }

        public a a(long j, TimeUnit timeUnit) {
            this.f18917b = j;
            this.f18918c = timeUnit;
            return this;
        }

        public a b(long j, TimeUnit timeUnit) {
            this.f18919d = j;
            this.f18920e = timeUnit;
            return this;
        }

        public a c(long j, TimeUnit timeUnit) {
            this.f18921f = j;
            this.f18922g = timeUnit;
            return this;
        }

        public a a(g gVar) {
            this.f18916a.add(gVar);
            return this;
        }

        public i a() {
            return com.bytedance.sdk.component.b.a.a.a.a(this);
        }
    }

    public a b() {
        return new a(this);
    }
}
