package com.iab.omid.library.applovin.internal;

import android.content.Context;
import com.iab.omid.library.applovin.internal.d;
import com.iab.omid.library.applovin.utils.f;
import java.util.Date;

public class a implements d.a {

    /* renamed from: f  reason: collision with root package name */
    private static a f7659f = new a(new d());

    /* renamed from: a  reason: collision with root package name */
    protected f f7660a = new f();

    /* renamed from: b  reason: collision with root package name */
    private Date f7661b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7662c;

    /* renamed from: d  reason: collision with root package name */
    private d f7663d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7664e;

    private a(d dVar) {
        this.f7663d = dVar;
    }

    public static a a() {
        return f7659f;
    }

    private void c() {
        if (this.f7662c && this.f7661b != null) {
            for (com.iab.omid.library.applovin.adsession.a adSessionStatePublisher : c.c().a()) {
                adSessionStatePublisher.getAdSessionStatePublisher().a(b());
            }
        }
    }

    public void a(Context context) {
        if (!this.f7662c) {
            this.f7663d.a(context);
            this.f7663d.a((d.a) this);
            this.f7663d.e();
            this.f7664e = this.f7663d.c();
            this.f7662c = true;
        }
    }

    public void a(boolean z) {
        if (!this.f7664e && z) {
            d();
        }
        this.f7664e = z;
    }

    public Date b() {
        Date date = this.f7661b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a2 = this.f7660a.a();
        Date date = this.f7661b;
        if (date == null || a2.after(date)) {
            this.f7661b = a2;
            c();
        }
    }
}
