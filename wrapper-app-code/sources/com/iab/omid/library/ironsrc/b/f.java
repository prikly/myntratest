package com.iab.omid.library.ironsrc.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.a.c;
import com.iab.omid.library.ironsrc.a.d;
import com.iab.omid.library.ironsrc.a.e;
import com.iab.omid.library.ironsrc.adsession.a;
import com.iab.omid.library.ironsrc.b.b;
import com.iab.omid.library.ironsrc.walking.TreeWalker;

public class f implements c, b.a {

    /* renamed from: a  reason: collision with root package name */
    private static f f7891a;

    /* renamed from: b  reason: collision with root package name */
    private float f7892b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    private final e f7893c;

    /* renamed from: d  reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.a.b f7894d;

    /* renamed from: e  reason: collision with root package name */
    private d f7895e;

    /* renamed from: f  reason: collision with root package name */
    private a f7896f;

    public f(e eVar, com.iab.omid.library.ironsrc.a.b bVar) {
        this.f7893c = eVar;
        this.f7894d = bVar;
    }

    public static f a() {
        if (f7891a == null) {
            f7891a = new f(new e(), new com.iab.omid.library.ironsrc.a.b());
        }
        return f7891a;
    }

    private a e() {
        if (this.f7896f == null) {
            this.f7896f = a.a();
        }
        return this.f7896f;
    }

    public void a(float f2) {
        this.f7892b = f2;
        for (a adSessionStatePublisher : e().c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().a(f2);
        }
    }

    public void a(Context context) {
        this.f7895e = this.f7893c.a(new Handler(), context, this.f7894d.a(), this);
    }

    public void b() {
        b.a().a((b.a) this);
        b.a().b();
        if (b.a().d()) {
            TreeWalker.getInstance().a();
        }
        this.f7895e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f7895e.b();
    }

    public float d() {
        return this.f7892b;
    }
}
