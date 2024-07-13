package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.n;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class f implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<f> f15816a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final p f15817b;

    /* renamed from: c  reason: collision with root package name */
    private final n f15818c;

    private f(long j, n nVar, final Runnable runnable) {
        this.f15817b = p.a(j, nVar, new Runnable() {
            public void run() {
                f.this.a();
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.f15818c = nVar;
        f15816a.add(this);
        nVar.am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        nVar.am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public static f a(long j, n nVar, Runnable runnable) {
        return new f(j, nVar, runnable);
    }

    public void a() {
        this.f15817b.d();
        this.f15818c.am().unregisterReceiver(this);
        f15816a.remove(this);
    }

    public long b() {
        return this.f15817b.a();
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f15817b.b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f15817b.c();
        }
    }
}
