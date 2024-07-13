package com.appodeal.ads.storage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Lazy f17403a = LazyKt.lazy(a.f17404a);

    public static final class a extends Lambda implements Function0<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17404a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new b();
        }
    }

    public static final b a() {
        return (b) f17403a.getValue();
    }
}
