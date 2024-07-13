package com.appodeal.ads.modules.libs.network.httpclients;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Lazy f16776a = LazyKt.lazy(a.f16780a);

    /* renamed from: b  reason: collision with root package name */
    public static final Lazy f16777b = LazyKt.lazy(d.f16783a);

    /* renamed from: c  reason: collision with root package name */
    public static final Lazy f16778c = LazyKt.lazy(c.f16782a);

    /* renamed from: d  reason: collision with root package name */
    public static final Lazy f16779d = LazyKt.lazy(C0185b.f16781a);

    public static final class a extends Lambda implements Function0<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16780a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new a(MapsKt.mapOf(TuplesKt.to("Content-Type", CollectionsKt.listOf("application/json; charset=UTF-8"))), CollectionsKt.emptyList(), CollectionsKt.emptyList());
        }
    }

    /* renamed from: com.appodeal.ads.modules.libs.network.httpclients.b$b  reason: collision with other inner class name */
    public static final class C0185b extends Lambda implements Function0<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0185b f16781a = new C0185b();

        public C0185b() {
            super(0);
        }

        public final Object invoke() {
            Map mapOf = MapsKt.mapOf(TuplesKt.to("Content-Type", CollectionsKt.listOf("application/x-protobuf")));
            com.appodeal.ads.modules.libs.network.encoders.b bVar = com.appodeal.ads.modules.libs.network.encoders.b.f16769a;
            return new a(mapOf, CollectionsKt.listOf(bVar), CollectionsKt.listOf(bVar));
        }
    }

    public static final class c extends Lambda implements Function0<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f16782a = new c();

        public c() {
            super(0);
        }

        public final Object invoke() {
            Map mapOf = MapsKt.mapOf(TuplesKt.to("Content-Type", CollectionsKt.listOf("text/plain; charset=UTF-8")));
            com.appodeal.ads.modules.libs.network.encoders.b bVar = com.appodeal.ads.modules.libs.network.encoders.b.f16769a;
            return new a(mapOf, CollectionsKt.listOf(bVar, com.appodeal.ads.modules.libs.network.encoders.a.f16768a), CollectionsKt.listOf(bVar));
        }
    }

    public static final class d extends Lambda implements Function0<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f16783a = new d();

        public d() {
            super(0);
        }

        public final Object invoke() {
            Map mapOf = MapsKt.mapOf(TuplesKt.to("Content-Type", CollectionsKt.listOf("text/plain; charset=UTF-8")));
            com.appodeal.ads.modules.libs.network.encoders.b bVar = com.appodeal.ads.modules.libs.network.encoders.b.f16769a;
            return new a(mapOf, CollectionsKt.listOf(bVar), CollectionsKt.listOf(bVar));
        }
    }

    public static final a a() {
        return (a) f16776a.getValue();
    }

    public static final a b() {
        return (a) f16779d.getValue();
    }

    public static final a c() {
        return (a) f16778c.getValue();
    }

    public static final a d() {
        return (a) f16777b.getValue();
    }
}
