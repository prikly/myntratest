package com.iab.omid.library.adcolony.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.adcolony.a.c;
import com.iab.omid.library.adcolony.a.d;
import com.iab.omid.library.adcolony.a.e;
import com.iab.omid.library.adcolony.adsession.a;
import com.iab.omid.library.adcolony.b.b;
import com.iab.omid.library.adcolony.walking.TreeWalker;

public class f implements c, b.a {

    /* renamed from: a  reason: collision with root package name */
    private static f f7455a;

    /* renamed from: b  reason: collision with root package name */
    private float f7456b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    private final e f7457c;

    /* renamed from: d  reason: collision with root package name */
    private final com.iab.omid.library.adcolony.a.b f7458d;

    /* renamed from: e  reason: collision with root package name */
    private d f7459e;

    /* renamed from: f  reason: collision with root package name */
    private a f7460f;

    public f(e eVar, com.iab.omid.library.adcolony.a.b bVar) {
        this.f7457c = eVar;
        this.f7458d = bVar;
    }

    public static f a() {
        if (f7455a == null) {
            f7455a = new f(new e(), new com.iab.omid.library.adcolony.a.b());
        }
        return f7455a;
    }

    private a e() {
        if (this.f7460f == null) {
            this.f7460f = a.a();
        }
        return this.f7460f;
    }

    public void a(float f2) {
        this.f7456b = f2;
        for (a adSessionStatePublisher : e().c()) {
            adSessionStatePublisher.getAdSessionStatePublisher().a(f2);
        }
    }

    public void a(Context context) {
        this.f7459e = this.f7457c.a(new Handler(), context, this.f7458d.a(), this);
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
        this.f7459e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f7459e.b();
    }

    public float d() {
        return this.f7456b;
    }
}
