package com.iab.omid.library.amazon.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.amazon.a.c;
import com.iab.omid.library.amazon.a.d;
import com.iab.omid.library.amazon.a.e;
import com.iab.omid.library.amazon.adsession.a;
import com.iab.omid.library.amazon.b.b;
import com.iab.omid.library.amazon.walking.TreeWalker;

public class f implements c, b.a {

    /* renamed from: a  reason: collision with root package name */
    private static f f7562a;

    /* renamed from: b  reason: collision with root package name */
    private float f7563b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    private final e f7564c;

    /* renamed from: d  reason: collision with root package name */
    private final com.iab.omid.library.amazon.a.b f7565d;

    /* renamed from: e  reason: collision with root package name */
    private d f7566e;

    /* renamed from: f  reason: collision with root package name */
    private a f7567f;

    public f(e eVar, com.iab.omid.library.amazon.a.b bVar) {
        this.f7564c = eVar;
        this.f7565d = bVar;
    }

    public static f a() {
        if (f7562a == null) {
            f7562a = new f(new e(), new com.iab.omid.library.amazon.a.b());
        }
        return f7562a;
    }

    private a e() {
        if (this.f7567f == null) {
            this.f7567f = a.a();
        }
        return this.f7567f;
    }

    public void a(float f2) {
        this.f7563b = f2;
        for (a adSessionStatePublisher : e().c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().a(f2);
        }
    }

    public void a(Context context) {
        this.f7566e = this.f7564c.a(new Handler(), context, this.f7565d.a(), this);
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
        this.f7566e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f7566e.b();
    }

    public float d() {
        return this.f7563b;
    }
}
