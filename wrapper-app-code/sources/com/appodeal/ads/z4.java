package com.appodeal.ads;

import com.appodeal.ads.initializing.b;
import com.appodeal.ads.services.g;
import com.appodeal.ads.storage.n;
import com.appodeal.ads.storage.o;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Lazy f17766a = LazyKt.lazy(a.f17767a);

    public static final class a extends Lambda implements Function0<x4> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17767a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new x4(new com.appodeal.ads.networking.usecases.a(k0.f16502a), g.c(), new a3(new l1()), new b(), new m1(0), com.appodeal.ads.utils.tracker.b.f17572b, d5.f16373b, c.f16319b, o.f17407b, n.f17405b);
        }
    }

    public static final t4 a() {
        return (t4) f17766a.getValue();
    }
}
