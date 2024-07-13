package com.appodeal.ads.services;

import com.appodeal.ads.services.c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Lazy f17323a = LazyKt.lazy(a.f17326a);

    /* renamed from: b  reason: collision with root package name */
    public static final Lazy f17324b = LazyKt.lazy(b.f17327a);

    /* renamed from: c  reason: collision with root package name */
    public static final Lazy f17325c = LazyKt.lazy(c.f17328a);

    public static final class a extends Lambda implements Function0<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17326a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return g.a();
        }
    }

    public static final class b extends Lambda implements Function0<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f17327a = new b();

        public b() {
            super(0);
        }

        public final Object invoke() {
            return g.a();
        }
    }

    public static final class c extends Lambda implements Function0<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f17328a = new c();

        public c() {
            super(0);
        }

        public final Object invoke() {
            return new d();
        }
    }

    public static final d a() {
        return (d) f17325c.getValue();
    }

    public static final c b() {
        return (c) f17323a.getValue();
    }

    public static final c.a c() {
        return (c.a) f17324b.getValue();
    }
}
