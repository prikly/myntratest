package com.iab.omid.library.amazon.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f7545a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.amazon.adsession.a> f7546b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.amazon.adsession.a> f7547c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f7545a;
    }

    public void a(com.iab.omid.library.amazon.adsession.a aVar) {
        this.f7546b.add(aVar);
    }

    public Collection<com.iab.omid.library.amazon.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f7546b);
    }

    public void b(com.iab.omid.library.amazon.adsession.a aVar) {
        boolean d2 = d();
        this.f7547c.add(aVar);
        if (!d2) {
            f.a().b();
        }
    }

    public Collection<com.iab.omid.library.amazon.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f7547c);
    }

    public void c(com.iab.omid.library.amazon.adsession.a aVar) {
        boolean d2 = d();
        this.f7546b.remove(aVar);
        this.f7547c.remove(aVar);
        if (d2 && !d()) {
            f.a().c();
        }
    }

    public boolean d() {
        return this.f7547c.size() > 0;
    }
}
