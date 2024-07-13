package com.applovin.impl.mediation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f15070a = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(com.applovin.impl.mediation.a.a aVar);
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        Iterator it = new ArrayList(this.f15070a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(aVar);
        }
    }

    public void a(a aVar) {
        this.f15070a.add(aVar);
    }

    public void b(a aVar) {
        this.f15070a.remove(aVar);
    }
}
