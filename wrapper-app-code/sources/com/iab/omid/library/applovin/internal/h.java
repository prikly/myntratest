package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.adsession.a;
import com.iab.omid.library.applovin.devicevolume.b;
import com.iab.omid.library.applovin.devicevolume.c;
import com.iab.omid.library.applovin.devicevolume.e;
import com.iab.omid.library.applovin.internal.d;
import com.iab.omid.library.applovin.walking.TreeWalker;

public class h implements c, d.a {

    /* renamed from: f  reason: collision with root package name */
    private static h f7681f;

    /* renamed from: a  reason: collision with root package name */
    private float f7682a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    private final e f7683b;

    /* renamed from: c  reason: collision with root package name */
    private final b f7684c;

    /* renamed from: d  reason: collision with root package name */
    private com.iab.omid.library.applovin.devicevolume.d f7685d;

    /* renamed from: e  reason: collision with root package name */
    private c f7686e;

    public h(e eVar, b bVar) {
        this.f7683b = eVar;
        this.f7684c = bVar;
    }

    private c a() {
        if (this.f7686e == null) {
            this.f7686e = c.c();
        }
        return this.f7686e;
    }

    public static h c() {
        if (f7681f == null) {
            f7681f = new h(new e(), new b());
        }
        return f7681f;
    }

    public void a(float f2) {
        this.f7682a = f2;
        for (a adSessionStatePublisher : a().a()) {
            adSessionStatePublisher.getAdSessionStatePublisher().a(f2);
        }
    }

    public void a(Context context) {
        this.f7685d = this.f7683b.a(new Handler(), context, this.f7684c.a(), this);
    }

    public void a(boolean z) {
        if (z) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f7682a;
    }

    public void d() {
        b.g().a((d.a) this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f7685d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f7685d.d();
    }
}
