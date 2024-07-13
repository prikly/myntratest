package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.ConfigProvider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.yandex.metrica.impl.ob.d1  reason: case insensitive filesystem */
public final class C0319d1 implements ConfigProvider<Lg> {

    /* renamed from: a  reason: collision with root package name */
    private final Lazy f5646a = LazyKt.lazy(new a(this));
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final L3 f5647b;

    /* renamed from: com.yandex.metrica.impl.ob.d1$a */
    static final class a extends Lambda implements Function0<Lg> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0319d1 f5648a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C0319d1 d1Var) {
            super(0);
            this.f5648a = d1Var;
        }

        public Object invoke() {
            return this.f5648a.f5647b.m();
        }
    }

    public C0319d1(L3 l3) {
        this.f5647b = l3;
    }

    public Lg a() {
        Lg lg = (Lg) this.f5646a.getValue();
        Intrinsics.checkNotNullExpressionValue(lg, "cachedConfig");
        return lg;
    }

    public Object getConfig() {
        Lg lg = (Lg) this.f5646a.getValue();
        Intrinsics.checkNotNullExpressionValue(lg, "cachedConfig");
        return lg;
    }
}
