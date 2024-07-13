package com.iab.omid.library.ironsrc.b;

import android.content.Context;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f7876a = new b();

    /* renamed from: b  reason: collision with root package name */
    private Context f7877b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7878c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7879d;

    /* renamed from: e  reason: collision with root package name */
    private a f7880e;

    public interface a {
    }

    private b() {
    }

    public static b a() {
        return f7876a;
    }

    private void e() {
        boolean z = !this.f7879d;
        for (com.iab.omid.library.ironsrc.adsession.a adSessionStatePublisher : a.a().b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().a(z);
        }
    }

    public void a(Context context) {
        this.f7877b = context.getApplicationContext();
    }

    public void a(a aVar) {
        this.f7880e = aVar;
    }

    public void b() {
        this.f7878c = true;
        e();
    }

    public void c() {
        this.f7878c = false;
        this.f7879d = false;
        this.f7880e = null;
    }

    public boolean d() {
        return !this.f7879d;
    }
}
