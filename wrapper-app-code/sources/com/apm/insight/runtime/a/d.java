package com.apm.insight.runtime.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.apm.insight.b;
import com.apm.insight.runtime.p;
import com.applovin.sdk.AppLovinEventTypes;

class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f10827a;

    private class a extends BroadcastReceiver {
        private a() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    int unused = d.this.f10827a = (int) ((((float) intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0)) * 100.0f) / ((float) intent.getIntExtra("scale", 100)));
                }
            } catch (Throwable unused2) {
            }
        }
    }

    d(final Context context) {
        p.b().a((Runnable) new Runnable() {
            public void run() {
                try {
                    d.this.a(context);
                } catch (Throwable th) {
                    b.a().a("NPTH_CATCH", th);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    public int a() {
        return this.f10827a;
    }
}
