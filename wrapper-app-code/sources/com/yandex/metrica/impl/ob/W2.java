package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.plugins.YandexMetricaPlugins;
import kotlin.jvm.internal.Intrinsics;

public final class W2 {

    /* renamed from: a  reason: collision with root package name */
    private static final YandexMetricaPlugins f5248a;

    static {
        P g2 = P.g();
        Intrinsics.checkNotNullExpressionValue(g2, "ClientServiceLocator.getInstance()");
        ICommonExecutor c2 = g2.c();
        Intrinsics.checkNotNullExpressionValue(c2, "ClientServiceLocator.get…stance().apiProxyExecutor");
        f5248a = new V2(new Tf(c2));
    }

    public static final YandexMetricaPlugins a() {
        return f5248a;
    }
}
