package com.yandex.metrica.impl.ob;

import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.e;
import com.yandex.metrica.i;
import com.yandex.metrica.impl.ob.C0368f0;
import java.util.List;

public interface T0 extends O0, C0368f0.a, C0568n1 {
    M0 a(e eVar);

    String a();

    void a(AppMetricaDeviceIDListener appMetricaDeviceIDListener);

    void a(DeferredDeeplinkListener deferredDeeplinkListener);

    void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    void a(IIdentifierCallback iIdentifierCallback, List<String> list);

    void a(YandexMetricaConfig yandexMetricaConfig, i iVar);

    String c();

    void c(e eVar);

    C0493k1 d();
}
