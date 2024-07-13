package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.os.Bundle;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.e;
import com.yandex.metrica.i;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.oj  reason: case insensitive filesystem */
public class C0611oj implements T0 {
    public M0 a(e eVar) {
        return new C0536lj();
    }

    public String a() {
        return null;
    }

    public void a(int i, Bundle bundle) {
    }

    public void a(Location location) {
    }

    public void a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
    }

    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    public void a(YandexMetricaConfig yandexMetricaConfig, i iVar) {
    }

    public void a(boolean z) {
    }

    public N0 b() {
        return new C0561mj();
    }

    public void b(boolean z) {
    }

    public String c() {
        return null;
    }

    public void c(e eVar) {
    }

    public void c(String str, String str2) {
    }

    public C0493k1 d() {
        return new C0493k1(new C0486jj());
    }

    public void setStatisticsSending(boolean z) {
    }

    public void setUserProfileID(String str) {
    }

    public void a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        iIdentifierCallback.onRequestError(IIdentifierCallback.Reason.UNKNOWN);
    }
}
