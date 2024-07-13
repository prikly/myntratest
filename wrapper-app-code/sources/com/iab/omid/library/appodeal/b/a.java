package com.iab.omid.library.appodeal.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f7766a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.appodeal.adsession.a> f7767b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.appodeal.adsession.a> f7768c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f7766a;
    }

    public void a(com.iab.omid.library.appodeal.adsession.a aVar) {
        this.f7767b.add(aVar);
    }

    public Collection<com.iab.omid.library.appodeal.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f7767b);
    }

    public void b(com.iab.omid.library.appodeal.adsession.a aVar) {
        boolean d2 = d();
        this.f7768c.add(aVar);
        if (!d2) {
            f.a().b();
        }
    }

    public Collection<com.iab.omid.library.appodeal.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f7768c);
    }

    public void c(com.iab.omid.library.appodeal.adsession.a aVar) {
        boolean d2 = d();
        this.f7767b.remove(aVar);
        this.f7768c.remove(aVar);
        if (d2 && !d()) {
            f.a().c();
        }
    }

    public boolean d() {
        return this.f7768c.size() > 0;
    }
}
