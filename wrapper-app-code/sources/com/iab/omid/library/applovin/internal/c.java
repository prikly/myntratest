package com.iab.omid.library.applovin.internal;

import com.iab.omid.library.applovin.adsession.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static c f7666c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<a> f7667a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<a> f7668b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f7666c;
    }

    public Collection<a> a() {
        return Collections.unmodifiableCollection(this.f7668b);
    }

    public void a(a aVar) {
        this.f7667a.add(aVar);
    }

    public Collection<a> b() {
        return Collections.unmodifiableCollection(this.f7667a);
    }

    public void b(a aVar) {
        boolean d2 = d();
        this.f7667a.remove(aVar);
        this.f7668b.remove(aVar);
        if (d2 && !d()) {
            h.c().e();
        }
    }

    public void c(a aVar) {
        boolean d2 = d();
        this.f7668b.add(aVar);
        if (!d2) {
            h.c().d();
        }
    }

    public boolean d() {
        return this.f7668b.size() > 0;
    }
}
