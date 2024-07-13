package com.appodeal.ads;

import com.appodeal.ads.context.b;
import com.appodeal.ads.services.g;
import com.appodeal.ads.storage.o;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Lazy f16484a = LazyKt.lazy(a.f16485a);

    public static final class a extends Lambda implements Function0<g4> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16485a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new g4(b.f16327b.f16328a.getApplicationContext(), o.f17407b, g.b(), com.appodeal.ads.services.b.a());
        }
    }

    public static final g4 a() {
        return (g4) f16484a.getValue();
    }
}
