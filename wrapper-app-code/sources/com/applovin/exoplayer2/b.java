package com.applovin.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11182a;

    /* renamed from: b  reason: collision with root package name */
    private final a f11183b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f11184c;

    private final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final C0107b f11186b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f11187c;

        public a(Handler handler, C0107b bVar) {
            this.f11187c = handler;
            this.f11186b = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f11187c.post(this);
            }
        }

        public void run() {
            if (b.this.f11184c) {
                this.f11186b.a();
            }
        }
    }

    /* renamed from: com.applovin.exoplayer2.b$b  reason: collision with other inner class name */
    public interface C0107b {
        void a();
    }

    public b(Context context, Handler handler, C0107b bVar) {
        this.f11182a = context.getApplicationContext();
        this.f11183b = new a(handler, bVar);
    }

    public void a(boolean z) {
        boolean z2;
        if (z && !this.f11184c) {
            this.f11182a.registerReceiver(this.f11183b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            z2 = true;
        } else if (!z && this.f11184c) {
            this.f11182a.unregisterReceiver(this.f11183b);
            z2 = false;
        } else {
            return;
        }
        this.f11184c = z2;
    }
}
