package com.yandex.metrica;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.impl.ob.C0494k2;
import com.yandex.metrica.impl.ob.C0618p1;
import com.yandex.metrica.impl.ob.C0642q1;
import com.yandex.metrica.impl.ob.C0665r1;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Vl;

public class MetricaService extends Service {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static C0618p1 f3374c;

    /* renamed from: a  reason: collision with root package name */
    private final d f3375a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final IMetricaService.a f3376b = new b(this);

    class a implements d {
        a() {
        }

        public void a(int i) {
            MetricaService.this.stopSelfResult(i);
        }
    }

    class b extends IMetricaService.a {
        b(MetricaService metricaService) {
        }

        public void a(int i, Bundle bundle) throws RemoteException {
            MetricaService.f3374c.a(i, bundle);
        }

        public void b(Bundle bundle) throws RemoteException {
            MetricaService.f3374c.b(bundle);
        }

        public void reportData(Bundle bundle) throws RemoteException {
            MetricaService.f3374c.reportData(bundle);
        }

        public void a(Bundle bundle) throws RemoteException {
            MetricaService.f3374c.a(bundle);
        }
    }

    static class c extends Binder {
        c() {
        }
    }

    public interface d {
        void a(int i);
    }

    public IBinder onBind(Intent intent) {
        IBinder iBinder;
        if ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(intent.getAction())) {
            iBinder = new c();
        } else {
            iBinder = this.f3376b;
        }
        f3374c.a(intent);
        return iBinder;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f3374c.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        super.onCreate();
        F0.a(getApplicationContext());
        Vl.a(getApplicationContext());
        C0618p1 p1Var = f3374c;
        if (p1Var == null) {
            f3374c = new C0642q1(new C0665r1(getApplicationContext(), this.f3375a));
        } else {
            p1Var.a(this.f3375a);
        }
        f3374c.a();
        F0.g().a(new C0494k2(f3374c));
    }

    public void onDestroy() {
        f3374c.b();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        super.onRebind(intent);
        f3374c.c(intent);
    }

    public void onStart(Intent intent, int i) {
        f3374c.a(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        f3374c.a(intent, i, i2);
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        f3374c.b(intent);
        if ("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER".equals(intent.getAction())) {
            return false;
        }
        if (intent.getData() == null) {
            return false;
        }
        return true;
    }
}
