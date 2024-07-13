package com.appodeal.ads.context;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Lazy f16329a = LazyKt.lazy(a.f16330a);

    public static final class a extends Lambda implements Function0<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16330a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new f();
        }
    }

    public static final f a() {
        return (f) f16329a.getValue();
    }
}
