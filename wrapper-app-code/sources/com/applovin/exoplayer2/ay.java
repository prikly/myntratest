package com.applovin.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.unity3d.services.core.device.MimeTypes;

final class ay {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11170a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Handler f11171b;

    /* renamed from: c  reason: collision with root package name */
    private final a f11172c;

    /* renamed from: d  reason: collision with root package name */
    private final AudioManager f11173d;

    /* renamed from: e  reason: collision with root package name */
    private b f11174e;

    /* renamed from: f  reason: collision with root package name */
    private int f11175f = 3;

    /* renamed from: g  reason: collision with root package name */
    private int f11176g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11177h;

    public interface a {
        void a(int i, boolean z);

        void f(int i);
    }

    private final class b extends BroadcastReceiver {
        private b() {
        }

        public void onReceive(Context context, Intent intent) {
            ay.this.f11171b.post(new Runnable() {
                public final void run() {
                    ay.this.d();
                }
            });
        }
    }

    public ay(Context context, Handler handler, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f11170a = applicationContext;
        this.f11171b = handler;
        this.f11172c = aVar;
        AudioManager audioManager = (AudioManager) com.applovin.exoplayer2.l.a.a((AudioManager) applicationContext.getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f11173d = audioManager;
        this.f11176g = a(audioManager, 3);
        this.f11177h = b(this.f11173d, this.f11175f);
        b bVar = new b();
        try {
            this.f11170a.registerReceiver(bVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f11174e = bVar;
        } catch (RuntimeException e2) {
            q.b("StreamVolumeManager", "Error registering stream volume receiver", e2);
        }
    }

    private static int a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e2) {
            q.b("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e2);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    private static boolean b(AudioManager audioManager, int i) {
        return ai.f13525a >= 23 ? audioManager.isStreamMute(i) : a(audioManager, i) == 0;
    }

    /* access modifiers changed from: private */
    public void d() {
        int a2 = a(this.f11173d, this.f11175f);
        boolean b2 = b(this.f11173d, this.f11175f);
        if (this.f11176g != a2 || this.f11177h != b2) {
            this.f11176g = a2;
            this.f11177h = b2;
            this.f11172c.a(a2, b2);
        }
    }

    public int a() {
        if (ai.f13525a >= 28) {
            return this.f11173d.getStreamMinVolume(this.f11175f);
        }
        return 0;
    }

    public void a(int i) {
        if (this.f11175f != i) {
            this.f11175f = i;
            d();
            this.f11172c.f(i);
        }
    }

    public int b() {
        return this.f11173d.getStreamMaxVolume(this.f11175f);
    }

    public void c() {
        b bVar = this.f11174e;
        if (bVar != null) {
            try {
                this.f11170a.unregisterReceiver(bVar);
            } catch (RuntimeException e2) {
                q.b("StreamVolumeManager", "Error unregistering stream volume receiver", e2);
            }
            this.f11174e = null;
        }
    }
}
