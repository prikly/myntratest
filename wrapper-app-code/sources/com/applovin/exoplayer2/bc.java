package com.applovin.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.applovin.exoplayer2.l.q;

final class bc {

    /* renamed from: a  reason: collision with root package name */
    private final WifiManager f11385a;

    /* renamed from: b  reason: collision with root package name */
    private WifiManager.WifiLock f11386b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11387c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11388d;

    public bc(Context context) {
        this.f11385a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void a() {
        WifiManager.WifiLock wifiLock = this.f11386b;
        if (wifiLock != null) {
            if (!this.f11387c || !this.f11388d) {
                this.f11386b.release();
            } else {
                wifiLock.acquire();
            }
        }
    }

    public void a(boolean z) {
        if (z && this.f11386b == null) {
            WifiManager wifiManager = this.f11385a;
            if (wifiManager == null) {
                q.c("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f11386b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f11387c = z;
        a();
    }

    public void b(boolean z) {
        this.f11388d = z;
        a();
    }
}
