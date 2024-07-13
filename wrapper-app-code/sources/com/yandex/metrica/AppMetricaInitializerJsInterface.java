package com.yandex.metrica;

import android.webkit.JavascriptInterface;
import com.yandex.metrica.impl.ob.Uf;

public class AppMetricaInitializerJsInterface {

    /* renamed from: a  reason: collision with root package name */
    private final Uf f3361a;

    public AppMetricaInitializerJsInterface(Uf uf) {
        this.f3361a = uf;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f3361a.c(str);
    }
}
