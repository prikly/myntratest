package com.iab.omid.library.adcolony.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f7438a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.adcolony.adsession.a> f7439b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.adcolony.adsession.a> f7440c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f7438a;
    }

    public void a(com.iab.omid.library.adcolony.adsession.a aVar) {
        this.f7439b.add(aVar);
    }

    public Collection<com.iab.omid.library.adcolony.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f7439b);
    }

    public void b(com.iab.omid.library.adcolony.adsession.a aVar) {
        boolean d2 = d();
        this.f7440c.add(aVar);
        if (!d2) {
            f.a().b();
        }
    }

    public Collection<com.iab.omid.library.adcolony.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f7440c);
    }

    public void c(com.iab.omid.library.adcolony.adsession.a aVar) {
        boolean d2 = d();
        this.f7439b.remove(aVar);
        this.f7440c.remove(aVar);
        if (d2 && !d()) {
            f.a().c();
        }
    }

    public boolean d() {
        return this.f7440c.size() > 0;
    }
}
