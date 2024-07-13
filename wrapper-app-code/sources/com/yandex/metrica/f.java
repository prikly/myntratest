package com.yandex.metrica;

import android.app.Application;
import android.content.Context;
import android.webkit.WebView;
import com.yandex.metrica.impl.ob.C0243a0;
import com.yandex.metrica.impl.ob.C0594o2;
import com.yandex.metrica.impl.ob.C0640q;
import com.yandex.metrica.impl.ob.D2;
import com.yandex.metrica.impl.ob.P;
import com.yandex.metrica.impl.ob.R2;
import com.yandex.metrica.impl.ob.Sf;
import com.yandex.metrica.impl.ob.Uf;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final Sf f3607a;

    /* renamed from: b  reason: collision with root package name */
    private final D2 f3608b;

    /* renamed from: c  reason: collision with root package name */
    private final C0640q f3609c;

    /* renamed from: d  reason: collision with root package name */
    private final C0594o2 f3610d;

    /* renamed from: e  reason: collision with root package name */
    private final C0243a0 f3611e;

    public f(Sf sf, D2 d2) {
        this(sf, d2, P.g().b(), P.g().l(), P.g().e());
    }

    public void a(Context context, YandexMetricaConfig yandexMetricaConfig) {
        i iVar = (i) yandexMetricaConfig;
        this.f3611e.a(context);
        Boolean bool = iVar.sessionsAutoTrackingEnabled;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            this.f3610d.a();
        }
        this.f3607a.getClass();
        R2.a(context).b(iVar);
    }

    public void b(Context context) {
        this.f3611e.a(context);
    }

    public void c(Context context) {
        this.f3611e.a(context);
    }

    public f(Sf sf, D2 d2, C0640q qVar, C0594o2 o2Var, C0243a0 a0Var) {
        this.f3607a = sf;
        this.f3608b = d2;
        this.f3609c = qVar;
        this.f3610d = o2Var;
        this.f3611e = a0Var;
    }

    public C0640q.c a(Application application) {
        this.f3609c.a(application);
        return this.f3610d.a();
    }

    public void a(Context context) {
        this.f3611e.a(context);
    }

    public void a(WebView webView, Uf uf) {
        this.f3608b.a(webView, uf);
    }
}
