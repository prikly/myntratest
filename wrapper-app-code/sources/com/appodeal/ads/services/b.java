package com.appodeal.ads.services;

import com.appodeal.ads.modules.common.internal.service.ServicesRegistry;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Lazy f17297a = LazyKt.lazy(a.f17298a);

    public static final class a extends Lambda implements Function0<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17298a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new a();
        }
    }

    public static final ServicesRegistry a() {
        return (ServicesRegistry) f17297a.getValue();
    }
}
