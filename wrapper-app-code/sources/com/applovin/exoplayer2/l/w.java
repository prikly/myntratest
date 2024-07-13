package com.applovin.exoplayer2.l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.applovin.exoplayer2.l.w;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static w f13596a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f13597b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<b>> f13598c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final Object f13599d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private int f13600e = 0;

    public static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static volatile boolean f13601a;
    }

    public interface b {
        void onNetworkTypeChanged(int i);
    }

    private final class c extends BroadcastReceiver {
        private c() {
        }

        public void onReceive(Context context, Intent intent) {
            int b2 = w.c(context);
            if (ai.f13525a >= 29 && !a.f13601a && b2 == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) a.b((TelephonyManager) context.getSystemService("phone"));
                    d dVar = new d();
                    if (ai.f13525a < 31) {
                        telephonyManager.listen(dVar, 1);
                    } else {
                        telephonyManager.listen(dVar, 1048576);
                    }
                    telephonyManager.listen(dVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            w.this.a(b2);
        }
    }

    private class d extends PhoneStateListener {
        private d() {
        }

        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            w.this.a(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        public void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2 = serviceState == null ? "" : serviceState.toString();
            w.this.a(serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    private w(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new c(), intentFilter);
    }

    private static int a(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            case 20:
                return ai.f13525a >= 29 ? 9 : 0;
            default:
                return 6;
        }
    }

    public static synchronized w a(Context context) {
        w wVar;
        synchronized (w.class) {
            if (f13596a == null) {
                f13596a = new w(context);
            }
            wVar = f13596a;
        }
        return wVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.hasNext() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r0.next();
        r2 = (com.applovin.exoplayer2.l.w.b) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.onNetworkTypeChanged(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r3.f13598c.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f13598c.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f13599d
            monitor-enter(r0)
            int r1 = r3.f13600e     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0009:
            r3.f13600e = r4     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.applovin.exoplayer2.l.w$b>> r0 = r3.f13598c
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            com.applovin.exoplayer2.l.w$b r2 = (com.applovin.exoplayer2.l.w.b) r2
            if (r2 == 0) goto L_0x002a
            r2.onNetworkTypeChanged(r4)
            goto L_0x0012
        L_0x002a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.applovin.exoplayer2.l.w$b>> r2 = r3.f13598c
            r2.remove(r1)
            goto L_0x0012
        L_0x0030:
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.w.a(int):void");
    }

    private void b() {
        Iterator<WeakReference<b>> it = this.f13598c.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (next.get() == null) {
                this.f13598c.remove(next);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(b bVar) {
        bVar.onNetworkTypeChanged(a());
    }

    /* access modifiers changed from: private */
    public static int c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return a(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    public int a() {
        int i;
        synchronized (this.f13599d) {
            i = this.f13600e;
        }
        return i;
    }

    public void a(b bVar) {
        b();
        this.f13598c.add(new WeakReference(bVar));
        this.f13597b.post(new Runnable(bVar) {
            public final /* synthetic */ w.b f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                w.this.b(this.f$1);
            }
        });
    }
}
