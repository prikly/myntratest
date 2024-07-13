package com.iab.omid.library.ironsrc.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7855a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f7856b;

    /* renamed from: c  reason: collision with root package name */
    private final a f7857c;

    /* renamed from: d  reason: collision with root package name */
    private final c f7858d;

    /* renamed from: e  reason: collision with root package name */
    private float f7859e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f7855a = context;
        this.f7856b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f7857c = aVar;
        this.f7858d = cVar;
    }

    private boolean a(float f2) {
        return f2 != this.f7859e;
    }

    private float c() {
        return this.f7857c.a(this.f7856b.getStreamVolume(3), this.f7856b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f7858d.a(this.f7859e);
    }

    public final void a() {
        this.f7859e = c();
        d();
        this.f7855a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f7855a.getContentResolver().unregisterContentObserver(this);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        float c2 = c();
        if (a(c2)) {
            this.f7859e = c2;
            d();
        }
    }
}
