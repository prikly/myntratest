package com.iab.omid.library.adcolony.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7420a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f7421b;

    /* renamed from: c  reason: collision with root package name */
    private final a f7422c;

    /* renamed from: d  reason: collision with root package name */
    private final c f7423d;

    /* renamed from: e  reason: collision with root package name */
    private float f7424e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f7420a = context;
        this.f7421b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f7422c = aVar;
        this.f7423d = cVar;
    }

    private boolean a(float f2) {
        return f2 != this.f7424e;
    }

    private float c() {
        return this.f7422c.a(this.f7421b.getStreamVolume(3), this.f7421b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f7423d.a(this.f7424e);
    }

    public void a() {
        this.f7424e = c();
        d();
        this.f7420a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void b() {
        this.f7420a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c2 = c();
        if (a(c2)) {
            this.f7424e = c2;
            d();
        }
    }
}
