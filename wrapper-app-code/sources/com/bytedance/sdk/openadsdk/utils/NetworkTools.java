package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.concurrent.atomic.AtomicBoolean;

public class NetworkTools {

    /* renamed from: a  reason: collision with root package name */
    private static int f2182a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static long f2183b = -2147483648L;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicBoolean f2184c = new AtomicBoolean(false);

    public static int a(Context context, boolean z) {
        if (z || f2183b == -2147483648L) {
            e(context);
            return f2182a;
        }
        if (System.currentTimeMillis() - f2183b >= 60000) {
            c();
        }
        return f2182a;
    }

    /* access modifiers changed from: private */
    public static void c() {
        if (f2184c.compareAndSet(false, true)) {
            t.a(new g("getNetworkType") {
                public void run() {
                    NetworkTools.e(m.a());
                    NetworkTools.f2184c.set(false);
                }
            });
        }
    }

    public static int a(Context context) {
        return a(context, false);
    }

    /* access modifiers changed from: private */
    public static void e(Context context) {
        f2182a = o.c(context);
        f2183b = System.currentTimeMillis();
    }

    public static int b(Context context) {
        int a2 = a(context);
        if (a2 == 1) {
            return 0;
        }
        if (a2 == 4) {
            return 1;
        }
        if (a2 == 5) {
            return 4;
        }
        if (a2 != 6) {
            return a2;
        }
        return 5;
    }

    public static void c(Context context) {
        if (context == null) {
            try {
                context = m.a();
            } catch (Throwable unused) {
                return;
            }
        }
        context.registerReceiver(new NetworkReceiver(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public static class NetworkReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkTools.c();
            }
        }
    }
}
