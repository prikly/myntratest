package com.iab.omid.library.amazon.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7527a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f7528b;

    /* renamed from: c  reason: collision with root package name */
    private final a f7529c;

    /* renamed from: d  reason: collision with root package name */
    private final c f7530d;

    /* renamed from: e  reason: collision with root package name */
    private float f7531e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f7527a = context;
        this.f7528b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f7529c = aVar;
        this.f7530d = cVar;
    }

    private boolean a(float f2) {
        return f2 != this.f7531e;
    }

    private float c() {
        return this.f7529c.a(this.f7528b.getStreamVolume(3), this.f7528b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f7530d.a(this.f7531e);
    }

    public void a() {
        this.f7531e = c();
        d();
        this.f7527a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void b() {
        this.f7527a.getContentResolver().unregisterContentObserver(this);
    }

    public void onChange(boolean z) {
        super.onChange(z);
        float c2 = c();
        if (a(c2)) {
            this.f7531e = c2;
            d();
        }
    }
}
