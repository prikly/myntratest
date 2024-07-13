package com.yandex.metrica.impl.ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.yandex.metrica.impl.ob.b0  reason: case insensitive filesystem */
public class C0268b0 {

    /* renamed from: a  reason: collision with root package name */
    private final BroadcastReceiver f5496a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5497b = false;

    /* renamed from: com.yandex.metrica.impl.ob.b0$a */
    public static class a {
        public C0268b0 a(BroadcastReceiver broadcastReceiver) {
            return new C0268b0(broadcastReceiver);
        }
    }

    public C0268b0(BroadcastReceiver broadcastReceiver) {
        this.f5496a = broadcastReceiver;
    }

    public synchronized Intent a(Context context, IntentFilter intentFilter) {
        Intent intent;
        try {
            intent = context.registerReceiver(this.f5496a, intentFilter);
            try {
                this.f5497b = true;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            intent = null;
        }
        return intent;
    }

    public synchronized void a(Context context) {
        if (this.f5497b) {
            try {
                context.unregisterReceiver(this.f5496a);
                this.f5497b = false;
            } catch (Throwable unused) {
            }
        }
    }
}
