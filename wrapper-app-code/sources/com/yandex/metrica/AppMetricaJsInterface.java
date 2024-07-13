package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import com.yandex.metrica.impl.ob.Uf;

public class AppMetricaJsInterface {

    /* renamed from: a  reason: collision with root package name */
    private final Uf f3362a;

    public AppMetricaJsInterface(Uf uf) {
        this.f3362a = uf;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f3362a.c(str, str2);
    }
}
