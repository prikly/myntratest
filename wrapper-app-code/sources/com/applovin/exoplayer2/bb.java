package com.applovin.exoplayer2;

import android.content.Context;
import android.os.PowerManager;
import com.applovin.exoplayer2.l.q;

final class bb {

    /* renamed from: a  reason: collision with root package name */
    private final PowerManager f11381a;

    /* renamed from: b  reason: collision with root package name */
    private PowerManager.WakeLock f11382b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11383c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11384d;

    public bb(Context context) {
        this.f11381a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    private void a() {
        PowerManager.WakeLock wakeLock = this.f11382b;
        if (wakeLock != null) {
            if (!this.f11383c || !this.f11384d) {
                this.f11382b.release();
            } else {
                wakeLock.acquire();
            }
        }
    }

    public void a(boolean z) {
        if (z && this.f11382b == null) {
            PowerManager powerManager = this.f11381a;
            if (powerManager == null) {
                q.c("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f11382b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f11383c = z;
        a();
    }

    public void b(boolean z) {
        this.f11384d = z;
        a();
    }
}
