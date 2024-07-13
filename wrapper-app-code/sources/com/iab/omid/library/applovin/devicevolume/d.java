package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7654a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f7655b;

    /* renamed from: c  reason: collision with root package name */
    private final a f7656c;

    /* renamed from: d  reason: collision with root package name */
    private final c f7657d;

    /* renamed from: e  reason: collision with root package name */
    private float f7658e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f7654a = context;
        this.f7655b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f7656c = aVar;
        this.f7657d = cVar;
    }

    private float a() {
        return this.f7656c.a(this.f7655b.getStreamVolume(3), this.f7655b.getStreamMaxVolume(3));
    }

    private boolean a(float f2) {
        return f2 != this.f7658e;
    }

    private void b() {
        this.f7657d.a(this.f7658e);
    }

    public void c() {
        this.f7658e = a();
        b();
        this.f7654a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f7654a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float a2 = a();
        if (a(a2)) {
            this.f7658e = a2;
            b();
        }
    }
}
