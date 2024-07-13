package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.a.c;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.p;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private final n f15289a;

    /* renamed from: b  reason: collision with root package name */
    private final v f15290b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final a f15291c;

    /* renamed from: d  reason: collision with root package name */
    private p f15292d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f15293e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private long f15294f;

    public interface a {
        void onAdExpired();
    }

    public b(n nVar, a aVar) {
        this.f15289a = nVar;
        this.f15290b = nVar.D();
        this.f15291c = aVar;
    }

    private void a(long j) {
        synchronized (this.f15293e) {
            a();
            this.f15294f = System.currentTimeMillis() + j;
            this.f15289a.am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            this.f15289a.am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            if (((Boolean) this.f15289a.a(com.applovin.impl.sdk.c.a.F)).booleanValue() || !this.f15289a.ag().isApplicationPaused()) {
                this.f15292d = p.a(j, this.f15289a, new Runnable() {
                    public void run() {
                        b.this.a();
                        b.this.f15291c.onAdExpired();
                    }
                });
            }
        }
    }

    private void b() {
        p pVar = this.f15292d;
        if (pVar != null) {
            pVar.d();
            this.f15292d = null;
        }
    }

    private void c() {
        synchronized (this.f15293e) {
            b();
        }
    }

    private void d() {
        boolean z;
        synchronized (this.f15293e) {
            long currentTimeMillis = this.f15294f - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                a();
                z = true;
            } else {
                a(currentTimeMillis);
                z = false;
            }
        }
        if (z) {
            this.f15291c.onAdExpired();
        }
    }

    public void a() {
        synchronized (this.f15293e) {
            b();
            this.f15289a.am().unregisterReceiver(this);
        }
    }

    public boolean a(com.applovin.impl.mediation.a.a aVar) {
        long j;
        if (aVar instanceof c) {
            j = ((c) aVar).z();
        } else if (aVar instanceof d) {
            j = ((d) aVar).C();
        } else {
            throw new IllegalArgumentException("Ad does not support scheduling expiration");
        }
        long elapsedRealtime = j - (SystemClock.elapsedRealtime() - aVar.u());
        if (elapsedRealtime > 2000) {
            if (v.a()) {
                v vVar = this.f15290b;
                vVar.b("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime) + " seconds from now for " + aVar.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            a(elapsedRealtime);
            return true;
        } else if (!v.a()) {
            return false;
        } else {
            this.f15290b.b("AdExpirationManager", "Ad is already expired");
            return false;
        }
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        }
    }
}
