package com.iab.omid.library.appodeal.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7748a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f7749b;

    /* renamed from: c  reason: collision with root package name */
    private final a f7750c;

    /* renamed from: d  reason: collision with root package name */
    private final c f7751d;

    /* renamed from: e  reason: collision with root package name */
    private float f7752e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f7748a = context;
        this.f7749b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f7750c = aVar;
        this.f7751d = cVar;
    }

    private boolean a(float f2) {
        return f2 != this.f7752e;
    }

    private float c() {
        return this.f7750c.a(this.f7749b.getStreamVolume(3), this.f7749b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f7751d.a(this.f7752e);
    }

    public void a() {
        this.f7752e = c();
        d();
        this.f7748a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void b() {
        this.f7748a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c2 = c();
        if (a(c2)) {
            this.f7752e = c2;
            d();
        }
    }
}
