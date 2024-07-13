package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.core.device.MimeTypes;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class h extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    public static int f15535a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f15536b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f15537c;

    /* renamed from: d  reason: collision with root package name */
    private final n f15538d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<a> f15539e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private final Object f15540f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f15541g;

    /* renamed from: h  reason: collision with root package name */
    private int f15542h;

    public interface a {
        void a(int i);
    }

    h(n nVar) {
        this.f15538d = nVar;
        Context P = nVar.P();
        this.f15537c = P;
        this.f15536b = (AudioManager) P.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public static boolean a(int i) {
        return i == 0 || i == 1;
    }

    private void b() {
        this.f15538d.D();
        if (v.a()) {
            this.f15538d.D().b("AudioSessionManager", "Observing ringer mode...");
        }
        this.f15542h = f15535a;
        this.f15537c.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f15538d.am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        this.f15538d.am().registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void b(final int i) {
        if (!this.f15541g) {
            this.f15538d.D();
            if (v.a()) {
                v D = this.f15538d.D();
                D.b("AudioSessionManager", "Ringer mode is " + i);
            }
            synchronized (this.f15540f) {
                for (final a next : this.f15539e) {
                    AppLovinSdkUtils.runOnUiThread(new Runnable() {
                        public void run() {
                            next.a(i);
                        }
                    });
                }
            }
        }
    }

    private void c() {
        this.f15538d.D();
        if (v.a()) {
            this.f15538d.D().b("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f15537c.unregisterReceiver(this);
        this.f15538d.am().unregisterReceiver(this);
    }

    public int a() {
        return this.f15536b.getRingerMode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.applovin.impl.sdk.h.a r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f15540f
            monitor-enter(r0)
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f15539e     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x000d:
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f15539e     // Catch:{ all -> 0x0020 }
            r1.add(r3)     // Catch:{ all -> 0x0020 }
            java.util.Set<com.applovin.impl.sdk.h$a> r3 = r2.f15539e     // Catch:{ all -> 0x0020 }
            int r3 = r3.size()     // Catch:{ all -> 0x0020 }
            r1 = 1
            if (r3 != r1) goto L_0x001e
            r2.b()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.h.a(com.applovin.impl.sdk.h$a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.applovin.impl.sdk.h.a r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f15540f
            monitor-enter(r0)
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f15539e     // Catch:{ all -> 0x001f }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x000d:
            java.util.Set<com.applovin.impl.sdk.h$a> r1 = r2.f15539e     // Catch:{ all -> 0x001f }
            r1.remove(r3)     // Catch:{ all -> 0x001f }
            java.util.Set<com.applovin.impl.sdk.h$a> r3 = r2.f15539e     // Catch:{ all -> 0x001f }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x001d
            r2.c()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.h.b(com.applovin.impl.sdk.h$a):void");
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f15536b.getRingerMode());
        }
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f15541g = true;
            this.f15542h = this.f15536b.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f15541g = false;
            if (this.f15542h != this.f15536b.getRingerMode()) {
                this.f15542h = f15535a;
                b(this.f15536b.getRingerMode());
            }
        }
    }
}
