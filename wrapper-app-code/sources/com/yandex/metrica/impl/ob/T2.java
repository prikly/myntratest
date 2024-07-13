package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.e;
import com.yandex.metrica.i;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class T2 implements T0 {
    /* access modifiers changed from: private */
    public static final EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> n;

    /* renamed from: a  reason: collision with root package name */
    private final Context f5002a;

    /* renamed from: b  reason: collision with root package name */
    private final C0277b9 f5003b;

    /* renamed from: c  reason: collision with root package name */
    private final C0436hi f5004c;

    /* renamed from: d  reason: collision with root package name */
    private final C0284bg f5005d;

    /* renamed from: e  reason: collision with root package name */
    private final A3 f5006e;

    /* renamed from: f  reason: collision with root package name */
    private final R1 f5007f;

    /* renamed from: g  reason: collision with root package name */
    private final T1 f5008g;

    /* renamed from: h  reason: collision with root package name */
    private final C0517l0 f5009h;
    private final C0746ua i;
    private final C0735u j;
    private final C0594o2 k;
    private volatile C0493k1 l;
    /* access modifiers changed from: private */
    public IIdentifierCallback m;

    class a implements IIdentifierCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AppMetricaDeviceIDListener f5010a;

        a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.f5010a = appMetricaDeviceIDListener;
        }

        public void onReceive(Map<String, String> map) {
            IIdentifierCallback unused = T2.this.m = null;
            this.f5010a.onLoaded(map.get("appmetrica_device_id_hash"));
        }

        public void onRequestError(IIdentifierCallback.Reason reason) {
            IIdentifierCallback unused = T2.this.m = null;
            this.f5010a.onError((AppMetricaDeviceIDListener.Reason) T2.n.get(reason));
        }
    }

    static {
        EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> enumMap = new EnumMap<>(IIdentifierCallback.Reason.class);
        n = enumMap;
        enumMap.put(IIdentifierCallback.Reason.UNKNOWN, AppMetricaDeviceIDListener.Reason.UNKNOWN);
        enumMap.put(IIdentifierCallback.Reason.INVALID_RESPONSE, AppMetricaDeviceIDListener.Reason.INVALID_RESPONSE);
        enumMap.put(IIdentifierCallback.Reason.NETWORK, AppMetricaDeviceIDListener.Reason.NETWORK);
    }

    T2(Context context, S0 s0) {
        this(context.getApplicationContext(), s0, new C0277b9(C0477ja.a(context.getApplicationContext()).c()));
    }

    public N0 b() {
        return this.f5007f;
    }

    public void c(e eVar) {
        this.f5007f.c(eVar);
    }

    public C0493k1 d() {
        return this.l;
    }

    public void setStatisticsSending(boolean z) {
        this.l.b().setStatisticsSending(z);
    }

    public void setUserProfileID(String str) {
        this.l.b().setUserProfileID(str);
    }

    public void a(YandexMetricaConfig yandexMetricaConfig, i iVar) {
        this.i.a(this.f5002a, this.f5004c).a(yandexMetricaConfig, this.f5004c.c());
        C0315cm b2 = Ul.b(iVar.apiKey);
        Sl a2 = Ul.a(iVar.apiKey);
        this.f5009h.getClass();
        if (this.l == null) {
            this.f5005d.a();
            this.f5004c.a(b2);
            this.f5004c.a(iVar.f3630d);
            this.f5004c.a(iVar.f3628b);
            this.f5004c.a(iVar.f3629c);
            if (A2.a((Object) iVar.f3629c)) {
                this.f5004c.b("api");
            }
            this.f5006e.b(iVar);
            this.f5008g.a(iVar.locationTracking, iVar.statisticsSending, (Boolean) null);
            C0468j1 a3 = this.f5007f.a(iVar, false, this.f5003b);
            this.l = new C0493k1(a3, new C0467j0(a3));
            this.j.a(this.l.a());
            this.k.a(a3);
            this.f5004c.g();
            Log.i("AppMetrica", "Activate AppMetrica with APIKey " + A2.a(iVar.apiKey));
            if (Boolean.TRUE.equals(iVar.logs)) {
                b2.setEnabled();
                a2.setEnabled();
                C0315cm.a().setEnabled();
                Sl.a().setEnabled();
                return;
            }
            b2.setDisabled();
            a2.setDisabled();
            C0315cm.a().setDisabled();
            Sl.a().setDisabled();
        } else if (b2.isEnabled()) {
            b2.w("Appmetrica already has been activated!");
        }
    }

    public void b(boolean z) {
        this.l.b().b(z);
    }

    public String c() {
        return this.f5004c.b();
    }

    public void c(String str, String str2) {
        this.l.b().c(str, str2);
    }

    private T2(Context context, S0 s0, C0277b9 b9Var) {
        this(context, s0, b9Var, new O(context), new U2(), P.g(), new C0746ua());
    }

    T2(Context context, S0 s0, C0277b9 b9Var, O o, U2 u2, P p, C0746ua uaVar) {
        this.f5002a = context;
        this.f5003b = b9Var;
        Handler c2 = s0.c();
        A3 a2 = u2.a(context, u2.a(c2, this));
        this.f5006e = a2;
        C0517l0 f2 = p.f();
        this.f5009h = f2;
        T1 a3 = u2.a(a2, context, s0.b());
        this.f5008g = a3;
        f2.a(a3);
        o.a(context);
        C0436hi a4 = u2.a(context, a3, b9Var, c2);
        this.f5004c = a4;
        this.j = s0.a();
        this.i = uaVar;
        a3.a((C0485ji) a4);
        this.f5005d = u2.a(a3, b9Var, c2);
        this.f5007f = u2.a(context, a2, a3, c2, a4);
        this.k = p.l();
    }

    public void a(int i2, Bundle bundle) {
        this.f5004c.a(bundle, (Yh) null);
    }

    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f5005d.a(deferredDeeplinkParametersListener);
    }

    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f5005d.a(deferredDeeplinkListener);
    }

    public void a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        a aVar = new a(appMetricaDeviceIDListener);
        this.m = aVar;
        this.f5004c.a(aVar, Collections.singletonList("appmetrica_device_id_hash"), this.f5006e.a());
    }

    public M0 a(e eVar) {
        return this.f5007f.b(eVar);
    }

    public String a() {
        return this.f5004c.e();
    }

    public void a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        this.f5004c.a(iIdentifierCallback, list, this.f5006e.a());
    }

    public void a(Location location) {
        this.l.b().a(location);
    }

    public void a(boolean z) {
        this.l.b().a(z);
    }
}
