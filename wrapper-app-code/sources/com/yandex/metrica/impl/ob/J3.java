package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0496k4;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class J3<CU extends C0496k4> {

    /* renamed from: a  reason: collision with root package name */
    private final List<CU> f4309a = new CopyOnWriteArrayList();

    public void a(CU cu) {
        this.f4309a.add(cu);
    }

    public void b(CU cu) {
        this.f4309a.remove(cu);
    }

    public List<CU> a() {
        return this.f4309a;
    }
}
