package com.bytedance.sdk.openadsdk.g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.bytedance.sdk.component.utils.l;
import com.unity3d.services.core.device.MimeTypes;
import java.lang.ref.WeakReference;

/* compiled from: VolumeChangeObserver */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private int f1925a = -1;

    /* renamed from: b  reason: collision with root package name */
    private f f1926b;

    /* renamed from: c  reason: collision with root package name */
    private a f1927c;

    /* renamed from: d  reason: collision with root package name */
    private Context f1928d;

    /* renamed from: e  reason: collision with root package name */
    private AudioManager f1929e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1930f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1931g = false;

    /* renamed from: h  reason: collision with root package name */
    private int f1932h = -1;

    public g(Context context) {
        this.f1928d = context;
        this.f1929e = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public int a() {
        return this.f1932h;
    }

    public void a(int i) {
        this.f1932h = i;
    }

    public int b() {
        return this.f1925a;
    }

    public void b(int i) {
        this.f1925a = i;
    }

    public boolean c() {
        if (!this.f1931g) {
            return false;
        }
        this.f1931g = false;
        return true;
    }

    public int d() {
        try {
            if (this.f1929e != null) {
                return this.f1929e.getStreamMaxVolume(3);
            }
            return 15;
        } catch (Throwable th) {
            l.a("VolumeChangeObserver", "getMaxMusicVolumeError: ", th);
            return 15;
        }
    }

    public void a(boolean z) {
        a(z, false);
    }

    public void a(boolean z, boolean z2) {
        if (this.f1929e != null) {
            int i = 0;
            if (z) {
                int g2 = g();
                if (g2 != 0) {
                    this.f1925a = g2;
                }
                l.b("VolumeChangeObserver", "mute set volume to 0");
                this.f1929e.setStreamVolume(3, 0, 0);
                this.f1931g = true;
                return;
            }
            int i2 = this.f1925a;
            if (i2 == 0) {
                i2 = d() / 15;
            } else {
                if (i2 == -1) {
                    if (z2) {
                        i2 = d() / 15;
                    } else {
                        return;
                    }
                }
                l.b("VolumeChangeObserver", "not mute set volume to " + i2 + " mLastVolume=" + this.f1925a);
                this.f1925a = -1;
                this.f1929e.setStreamVolume(3, i2, i);
                this.f1931g = true;
            }
            i = 1;
            l.b("VolumeChangeObserver", "not mute set volume to " + i2 + " mLastVolume=" + this.f1925a);
            this.f1925a = -1;
            this.f1929e.setStreamVolume(3, i2, i);
            this.f1931g = true;
        }
    }

    public void a(f fVar) {
        this.f1926b = fVar;
    }

    public void e() {
        try {
            this.f1927c = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f1928d.registerReceiver(this.f1927c, intentFilter);
            this.f1930f = true;
        } catch (Throwable th) {
            l.a("VolumeChangeObserver", "registerReceiverError: ", th);
        }
    }

    public void f() {
        if (this.f1930f) {
            try {
                this.f1928d.unregisterReceiver(this.f1927c);
                this.f1926b = null;
                this.f1930f = false;
            } catch (Throwable th) {
                l.a("VolumeChangeObserver", "unregisterReceiverError: ", th);
            }
        }
    }

    public int g() {
        try {
            if (this.f1929e != null) {
                return this.f1929e.getStreamVolume(3);
            }
            return -1;
        } catch (Throwable th) {
            l.a("VolumeChangeObserver", "getCurrentMusicVolumeError: ", th);
            return -1;
        }
    }

    public f h() {
        return this.f1926b;
    }

    /* compiled from: VolumeChangeObserver */
    private static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<g> f1933a;

        public a(g gVar) {
            this.f1933a = new WeakReference<>(gVar);
        }

        public void onReceive(Context context, Intent intent) {
            f h2;
            int g2;
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    l.b("VolumeChangeObserver", "Media volume change notification.......");
                    g gVar = (g) this.f1933a.get();
                    if (gVar != null && (h2 = gVar.h()) != null && (g2 = gVar.g()) != gVar.a()) {
                        gVar.a(g2);
                        if (g2 >= 0) {
                            h2.b(g2);
                        }
                    }
                }
            } catch (Throwable th) {
                l.a("VolumeChangeObserver", "onVolumeChangedError: ", th);
            }
        }
    }
}
