package com.iab.omid.library.appodeal.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.appodeal.a.c;
import com.iab.omid.library.appodeal.a.d;
import com.iab.omid.library.appodeal.a.e;
import com.iab.omid.library.appodeal.adsession.a;
import com.iab.omid.library.appodeal.b.b;
import com.iab.omid.library.appodeal.walking.TreeWalker;

public class f implements c, b.a {

    /* renamed from: a  reason: collision with root package name */
    private static f f7783a;

    /* renamed from: b  reason: collision with root package name */
    private float f7784b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    private final e f7785c;

    /* renamed from: d  reason: collision with root package name */
    private final com.iab.omid.library.appodeal.a.b f7786d;

    /* renamed from: e  reason: collision with root package name */
    private d f7787e;

    /* renamed from: f  reason: collision with root package name */
    private a f7788f;

    public f(e eVar, com.iab.omid.library.appodeal.a.b bVar) {
        this.f7785c = eVar;
        this.f7786d = bVar;
    }

    public static f a() {
        if (f7783a == null) {
            f7783a = new f(new e(), new com.iab.omid.library.appodeal.a.b());
        }
        return f7783a;
    }

    private a e() {
        if (this.f7788f == null) {
            this.f7788f = a.a();
        }
        return this.f7788f;
    }

    public void a(float f2) {
        this.f7784b = f2;
        for (a adSessionStatePublisher : e().c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().a(f2);
        }
    }

    public void a(Context context) {
        this.f7787e = this.f7785c.a(new Handler(), context, this.f7786d.a(), this);
    }

    public void a(boolean z) {
        if (z) {
            TreeWalker.getInstance().a();
        } else {
            TreeWalker.getInstance().c();
        }
    }

    public void b() {
        b.a().a((b.a) this);
        b.a().b();
        TreeWalker.getInstance().a();
        this.f7787e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f7787e.b();
    }

    public float d() {
        return this.f7784b;
    }
}
