package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C0404gb;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* renamed from: com.yandex.metrica.impl.ob.hb  reason: case insensitive filesystem */
public final class C0429hb {

    /* renamed from: a  reason: collision with root package name */
    private final C0404gb.b f5908a = new C0404gb.b(false, 1);

    public final C0404gb a(Uh uh) {
        C0404gb.b bVar = this.f5908a;
        Random.Default defaultR = Random.Default;
        F0 g2 = F0.g();
        Intrinsics.checkNotNullExpressionValue(g2, "GlobalServiceLocator.getInstance()");
        Pm q = g2.q();
        Intrinsics.checkNotNullExpressionValue(q, "GlobalServiceLocator.get…).serviceExecutorProvider");
        ICommonExecutor g3 = q.g();
        Intrinsics.checkNotNullExpressionValue(g3, "GlobalServiceLocator.get…rovider.supportIOExecutor");
        M0 a2 = C0609oh.a();
        Intrinsics.checkNotNullExpressionValue(a2, "YandexMetricaSelfReportFacade.getReporter()");
        return new C0404gb(uh, bVar, defaultR, g3, new C0503kb(new C0478jb(uh, a2), uh));
    }
}
