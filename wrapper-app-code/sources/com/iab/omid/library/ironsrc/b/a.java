package com.iab.omid.library.ironsrc.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f7873a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.ironsrc.adsession.a> f7874b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.ironsrc.adsession.a> f7875c = new ArrayList<>();

    private a() {
    }

    public static a a() {
        return f7873a;
    }

    public void a(com.iab.omid.library.ironsrc.adsession.a aVar) {
        this.f7874b.add(aVar);
    }

    public Collection<com.iab.omid.library.ironsrc.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f7874b);
    }

    public void b(com.iab.omid.library.ironsrc.adsession.a aVar) {
        boolean d2 = d();
        this.f7875c.add(aVar);
        if (!d2) {
            f.a().b();
        }
    }

    public Collection<com.iab.omid.library.ironsrc.adsession.a> c() {
        return Collections.unmodifiableCollection(this.f7875c);
    }

    public void c(com.iab.omid.library.ironsrc.adsession.a aVar) {
        boolean d2 = d();
        this.f7874b.remove(aVar);
        this.f7875c.remove(aVar);
        if (d2 && !d()) {
            f.a().c();
        }
    }

    public boolean d() {
        return this.f7875c.size() > 0;
    }
}
