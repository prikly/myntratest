package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.d.f;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.a;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f15154b = new AtomicBoolean();

    /* renamed from: a  reason: collision with root package name */
    final n f15155a;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f15156c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f15157d = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicInteger f15158e = new AtomicInteger();

    /* renamed from: f  reason: collision with root package name */
    private Date f15159f;

    /* renamed from: g  reason: collision with root package name */
    private Date f15160g;

    SessionTracker(final n nVar) {
        this.f15155a = nVar;
        final Application application = (Application) nVar.P();
        application.registerActivityLifecycleCallbacks(new a() {
            public void onActivityResumed(Activity activity) {
                super.onActivityResumed(activity);
                SessionTracker.this.a();
            }
        });
        application.registerComponentCallbacks(new ComponentCallbacks2() {
            public void onConfigurationChanged(Configuration configuration) {
            }

            public void onLowMemory() {
            }

            public void onTrimMemory(int i) {
                SessionTracker.this.f15158e.set(i);
                if (i == 20) {
                    SessionTracker.this.b();
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    if (Utils.isCurrentProcessInForeground()) {
                        SessionTracker.this.a();
                    }
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    SessionTracker.this.b();
                }
            }
        }, intentFilter);
        if (((Boolean) nVar.a(b.cx)).booleanValue() && f15154b.compareAndSet(false, true)) {
            final Intent intent = new Intent(application, AppKilledService.class);
            application.startService(intent);
            nVar.am().registerReceiver(new AppLovinBroadcastManager.Receiver() {
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    application.stopService(intent);
                    nVar.am().unregisterReceiver(this);
                }
            }, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
    }

    /* access modifiers changed from: private */
    public void a() {
        if (this.f15157d.compareAndSet(true, false)) {
            d();
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        if (this.f15157d.compareAndSet(false, true)) {
            c();
        }
    }

    private void c() {
        this.f15155a.D();
        if (v.a()) {
            this.f15155a.D().b("SessionTracker", "Application Paused");
        }
        this.f15155a.am().sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), (Map<String, Object>) null);
        if (!this.f15156c.get()) {
            boolean booleanValue = ((Boolean) this.f15155a.a(b.ds)).booleanValue();
            long millis = TimeUnit.MINUTES.toMillis(((Long) this.f15155a.a(b.du)).longValue());
            if (this.f15159f == null || System.currentTimeMillis() - this.f15159f.getTime() >= millis) {
                ((EventServiceImpl) this.f15155a.x()).trackEvent("paused");
                if (booleanValue) {
                    this.f15159f = new Date();
                }
            }
            if (!booleanValue) {
                this.f15159f = new Date();
            }
        }
    }

    private void d() {
        this.f15155a.D();
        if (v.a()) {
            this.f15155a.D().b("SessionTracker", "Application Resumed");
        }
        boolean booleanValue = ((Boolean) this.f15155a.a(b.ds)).booleanValue();
        long longValue = ((Long) this.f15155a.a(b.dt)).longValue();
        this.f15155a.am().sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), (Map<String, Object>) null);
        if (!this.f15156c.getAndSet(false)) {
            long millis = TimeUnit.MINUTES.toMillis(longValue);
            if (this.f15160g == null || System.currentTimeMillis() - this.f15160g.getTime() >= millis) {
                ((EventServiceImpl) this.f15155a.x()).trackEvent("resumed");
                if (booleanValue) {
                    this.f15160g = new Date();
                }
            }
            if (!booleanValue) {
                this.f15160g = new Date();
            }
            this.f15155a.W().a(f.m);
        }
    }

    public int getLastTrimMemoryLevel() {
        return this.f15158e.get();
    }

    public boolean isApplicationPaused() {
        return this.f15157d.get();
    }

    public void pauseForClick() {
        this.f15156c.set(true);
    }

    public void resumeForClick() {
        this.f15156c.set(false);
    }
}
